package Ejercicio2;

public class EmpleadoTemporal extends Empleado{

	public EmpleadoTemporal(String name, Integer age, String idEmployee, Double salary) {
		super(name, age, idEmployee, salary);
	}
	
	@Override
	public void mostrarTipo() {
		System.out.println("The Employee " + this.getName() + " is a temporary worker");
	}
}
