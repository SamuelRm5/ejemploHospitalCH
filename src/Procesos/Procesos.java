package Procesos;

import javax.swing.JOptionPane;

import clases.CitaMedica;
import clases.ModeloDatos;
import clases.Paciente;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class Procesos {
	
	ModeloDatos miModeloDatos;
	
	public Procesos() {
		
		miModeloDatos= new ModeloDatos();
		
		presentarMenuOpciones();
	}
	
	public void presentarMenuOpciones() {
		
		String menu="MENU HOSPITAL\n\n";
		menu+="1. Registrar Paciente\n";
		menu+="2. Registrar Empleado\n";
		menu+="3. Registrar Cita Medica\n";
		menu+="4. Imprimir Informacion\n";
		menu+="5. Buscar por documento\n";
		menu+="6. Salir\n\n";
		menu+="Ingrese una Opci�n\n";
		
		int opcion=0;
		
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1: {registrarPaciente();  break;}
			case 2: {registrarEmpleado();  break;}
			case 3: {registrarCitaMedica();  break;}
			case 4: {imprimirInformacion();  break;}
			case 5: {buscarPorDNI();	break;}
			case 6: {System.out.println("El sistema termin�"); break;}
			default:System.out.println("El c�digo no existe, intente nuevamente");
				break;
			}
		} while (opcion!=6);
	}
	
	private void registrarPaciente() {
		Paciente miPaciente=new Paciente();
		miPaciente.registrarDatos();
		miModeloDatos.registrarPersona(miPaciente);
	}
	
	public void buscarPorDNI() {
		System.out.println("����������������������������������������������");
		System.out.println("BUSQUEDA POR DOCUMENTO");
		System.out.println("����������������������������������������������");
		String clave = JOptionPane.showInputDialog("Ingresa el documento a consular: ");
		miModeloDatos.consultaPorDNI(clave);
		
		
	}
	
	private void registrarEmpleado() {
		
		String menuTipoEmpleado="Registro de Empleado\n";
		menuTipoEmpleado+="1. Empleado eventual\n";
		menuTipoEmpleado+="2. Empleado por plantilla\n";
		menuTipoEmpleado+="Seleccione el tipo de empleado a registrar\n";
		
		int tipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));
		
		switch (tipoEmpleado) {
		case 1: //Registro Empleado Eventual
				EmpleadoEventual miEmpleadoEventual=new EmpleadoEventual();
				miEmpleadoEventual.registrarDatos();
				miModeloDatos.registrarPersona(miEmpleadoEventual);
			break;
		
		case 2:
			String resp=JOptionPane.showInputDialog("Ingrese si, si es un medico, de lo contrartio es otro tipo de empleado ");
			if (resp.equalsIgnoreCase("si")) {
				//Refistro medico//
				Medico miMedico=new Medico();
				miMedico.registrarDatos();
				miModeloDatos.registrarPersona(miMedico);
			}else {
				//registro empleado planilla
				EmpleadoPlanilla miEmpleadoPlanilla=new EmpleadoPlanilla();
				miEmpleadoPlanilla.registrarDatos();
				miModeloDatos.registrarPersona(miEmpleadoPlanilla);
			}
			
			break;
			
		
		default:System.out.println("El tipo de empleado no es valido, intentelo nuevamente");
				break;
			}
		}
			
		
		private void imprimirInformacion() {
			
			
			String menuImprimir="MENI IMPRESIONES\n";
			menuImprimir+="1. Listar Pacientes\n";
			menuImprimir+="2. Listar Empleados Eventuales\n";
			menuImprimir+="3. Listar Empleados Por Planilla\n";
			menuImprimir+="4. Listar Medicos\n";
			menuImprimir+="5. Listar Citas Programadas\n";
			menuImprimir+="Ingrese una opcion\n";
			
			System.out.println("****************************************************************");
			
			int opcion=Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));
			
			switch (opcion) {
			case 1: miModeloDatos.imprimirPacientes(); break;
			case 2: miModeloDatos.imprimirEmpleadosEventuales(); break;
			case 3: miModeloDatos.imprimirEmpleadosPorPlanilla(); break;
			case 4: miModeloDatos.imprimirMedicos(); break;
			case 5: miModeloDatos.imprimirCitasMedicasProgramadas(); break;
			
			default:System.out.println("No existe esa opcion");
			break;
				
			}
		}
		
		private void registrarCitaMedica() {
			String documentoPaciente=JOptionPane.showInputDialog("Ingrese el documento del paciente");
			
			Paciente pacienteEncontrado=miModeloDatos.consultarPacientePorDocumento(documentoPaciente);
			
			if (pacienteEncontrado!=null) {
				String nombreMedico=JOptionPane.showInputDialog("Ingrese el nombre del medico");
				Medico medicoEncontrado=miModeloDatos.consultaMedicoPorNombre(nombreMedico);
				
				if (medicoEncontrado!=null) {
					String servicio=JOptionPane.showInputDialog("Ingrese el servicio o motivo de la consulta");
					String fechaConsulta=JOptionPane.showInputDialog("Ingrese la fecha de la consulta");
					String horaConsulta=JOptionPane.showInputDialog("Ingrese la hora de la consulta");
					
					String lugar="La cita sera en el consultorio "+medicoEncontrado.getNumeroDeConsultorio();
					CitaMedica miCita=new CitaMedica(pacienteEncontrado, medicoEncontrado, servicio, fechaConsulta, horaConsulta, lugar);
					miModeloDatos.registrarCitaMedica(miCita);
					
				}else {
					System.out.println("El medico no se encuentra registrado en el sistema");
				}
			}else {
				System.out.println("El paciente no se encuentra registrado en el sistema");
			}
		}

		
	}


