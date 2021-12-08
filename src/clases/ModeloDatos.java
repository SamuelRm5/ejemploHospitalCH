package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Procesos.Procesos;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;


public class ModeloDatos {
	
	
	HashMap<String, Paciente> pacientesMap;
	HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
	HashMap<String, EmpleadoEventual> empleadosEventualMap;
	HashMap<String, Medico> medicosMap;
	ArrayList<CitaMedica> citasList;
	
	public ModeloDatos() {
		pacientesMap=new HashMap<String, Paciente>();
		empleadosPlanillaMap=new  HashMap<String, EmpleadoPlanilla>();
		medicosMap=new HashMap<String, Medico>();
		empleadosEventualMap=new HashMap<String, EmpleadoEventual>();
		citasList=new ArrayList<CitaMedica>();
	}

	public void registrarPersona(Paciente miPaciente) {
		if (pacientesMap.containsKey(miPaciente.getNumeroDeDNI())) {
			System.out.println("El DNI "+miPaciente.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(miPaciente.getNumeroDeDNI())) {
			System.out.println("El DNI "+miPaciente.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(miPaciente.getNumeroDeDNI())) {
			System.out.println("El DNI "+miPaciente.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(medicosMap.containsKey(miPaciente.getNumeroDeDNI())) {
			System.out.println("El DNI "+miPaciente.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else{
			pacientesMap.put(miPaciente.getNumeroDeDNI(), miPaciente);
			System.out.println("Se ha registrado el paciente "+ miPaciente.getNombre() +", satisfactoriamente");
		}
		
	}
	public void registrarPersona(EmpleadoPlanilla miEmpPlanilla) {
		if (pacientesMap.containsKey(miEmpPlanilla.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpPlanilla.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(miEmpPlanilla.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpPlanilla.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(miEmpPlanilla.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpPlanilla.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(medicosMap.containsKey(miEmpPlanilla.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpPlanilla.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else{
			empleadosPlanillaMap.put(miEmpPlanilla.getNumeroDeDNI(), miEmpPlanilla);
			System.out.println("Se ha registrado el empleado por planilla "+ miEmpPlanilla.getNombre() +", satisfactoriamente");
		}
	}
	public void registrarPersona(EmpleadoEventual miEmpEventual) {
		if (pacientesMap.containsKey(miEmpEventual.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpEventual.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(miEmpEventual.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpEventual.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(miEmpEventual.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpEventual.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(medicosMap.containsKey(miEmpEventual.getNumeroDeDNI())) {
			System.out.println("El DNI "+miEmpEventual.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else{
			empleadosEventualMap.put(miEmpEventual.getNumeroDeDNI(), miEmpEventual);
			System.out.println("Se ha registrado el empleado eventual "+ miEmpEventual.getNombre() +", satisfactoriamente");
		}
	}
	public void registrarPersona(Medico miMedico) {
		if (pacientesMap.containsKey(miMedico.getNumeroDeDNI())) {
			System.out.println("El DNI "+miMedico.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(miMedico.getNumeroDeDNI())) {
			System.out.println("El DNI "+miMedico.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(miMedico.getNumeroDeDNI())) {
			System.out.println("El DNI "+miMedico.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else if(medicosMap.containsKey(miMedico.getNumeroDeDNI())) {
			System.out.println("El DNI "+miMedico.getNumeroDeDNI()+" "
					+ "ya está registrado, por favor llene nuevamente los datos");
		}else{
			medicosMap.put(miMedico.getNumeroDeDNI(), miMedico);
			System.out.println("Se ha registrado el médico "+ miMedico.getNombre() +", satisfactoriamente");
		}
	}
	public void consultaPorDNI(String clave) {
		if (pacientesMap.containsKey(clave)) {
			pacientesMap.get(clave).imprimirDatosPersona("Este es un PACIENTE \n\n");
			
		}else if(empleadosPlanillaMap.containsKey(clave)) {
			empleadosPlanillaMap.get(clave).imprimirDatosPersona("Este es un EMPLEADO POR PLANILLA \n\n");
		}
		else if(empleadosEventualMap.containsKey(clave)) {
			empleadosEventualMap.get(clave).imprimirDatosPersona("Este es un EMPLEADO EVENTUAL \n\n");
		}
		else if(medicosMap.containsKey(clave)) {
			medicosMap.get(clave).imprimirDatosPersona("Este es un MEDICO \n\n");
		}else {
			System.out.println("El documento no existe");
			Procesos procesos=new Procesos();
			procesos.presentarMenuOpciones();
		}

	}
	
	public void imprimirPacientes() {
		System.out.println("**************||**************");
		String msj="PACIENTES REGISTRADOS\n";
		Iterator<String> iterator=pacientesMap.keySet().iterator();
		if (pacientesMap.size()==0) {
			System.out.println("No se encuentran pacientes registrados");
		}
		while (iterator.hasNext()) {
			
			String clave = iterator.next();
			pacientesMap.get(clave).imprimirDatosPersona(msj);
			}
	}
	public void imprimirEmpleadosEventuales() {
		String msj="EMPLEADOS EVENTUALES REGISTRADOS\n";
		if (empleadosEventualMap.size()==0) {
			System.out.println("No se encuentran empleados eventuales registrados");
		}
		for (String clave : empleadosEventualMap.keySet()) {
			empleadosEventualMap.get(clave).imprimirDatosPersona(msj);
		}
	}
	public void imprimirEmpleadosPorPlanilla() {
		String msj="EMPLEADOS POR PLANILLA REGISTRADOS\n";
		if (empleadosPlanillaMap.size()==0) {
			System.out.println("No se encuentran empleados por planilla registrados");
		}
		for (EmpleadoPlanilla empleadoPlanilla : empleadosPlanillaMap.values()) {
			empleadoPlanilla.imprimirDatosPersona(msj);
		}
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("--------------------------------------------");
		imprimirMedicos();
	}
	public void imprimirMedicos() {
		String msj="MEDICOS REGISTRADOS\n";
		if (medicosMap.size()==0) {
			System.out.println("No se encuentran medicos registrados");
		}
		for (Map.Entry<String, Medico> elemento : medicosMap.entrySet()){
			elemento.getValue().imprimirDatosPersona(msj);
		}
	}
	
	public Medico consultaMedicoPorNombre(String nombreMedico) {
		
		for (Medico medico : medicosMap.values()) {
			
			if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
				return medico;
			}
		}
		return null;
	}
	
	
	
	
	public Paciente consultarPacientePorDocumento(String documentoPaciente) {
		Paciente miPaciente=null;
		
		if (pacientesMap.containsKey(documentoPaciente)) {
			miPaciente=pacientesMap.get(documentoPaciente);
			
		}
		return miPaciente;
	}
	
	public void registrarCitaMedica(CitaMedica miCita) {
		citasList.add(miCita);
		System.out.println("Se ha registrado la cita exitosamente\n");
		System.out.println(miCita.informacionCitaMedica());
	}
	
	public void imprimirCitasMedicasProgramadas() {
		String msj="CITAS MEDICAS PROGAMADAS\n";
		CitaMedica miCita=null;
		
		System.out.println(msj+"\n");
		
		if (citasList.size()>0) {
			for (int i = 0; i < citasList.size(); i++) {
				miCita=citasList.get(i);
				System.out.println(miCita.informacionCitaMedica());
				
			}
		}else {
			System.out.println("No existen citas programadas");
	}
}
	
	
}
