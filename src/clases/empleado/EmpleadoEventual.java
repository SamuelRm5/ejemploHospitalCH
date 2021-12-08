package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {
	
	private double honorariosPorHora;
	private String fechaTerminoContrato;
	
	
	
	@Override
	public void registrarDatos() {
		
		super.registrarDatos();
		try {
			honorariosPorHora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensual"));
		} catch (Exception e) {
			System.out.println("ERROR: Ingrese números, no letras");
			honorariosPorHora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensual"));
		}
		
		fechaTerminoContrato=JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/aaaa)");
		}
	
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos = "Honorarios por hora: " + honorariosPorHora + "\n";
		datos = "Fecha Termino del Contrato: " + fechaTerminoContrato + "\n";
		
		System.out.println(datos);
	}
	
	public double getHorariosPorHora() {
		return honorariosPorHora;
	}
	public void setHorariosPorHora(double horariosPorHora) {
		this.honorariosPorHora = horariosPorHora;
	}
	public String getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}
	public void setFechaTerminoContrato(String fechaTerminoContrato) {
		this.fechaTerminoContrato = fechaTerminoContrato;
	}
	
	
}
