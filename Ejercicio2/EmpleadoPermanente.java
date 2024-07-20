package Ejercicio2;

public class EmpleadoPermanente extends Empleado {
	public EmpleadoPermanente(String name, Integer age, String idEmployee, Double salary) {
		super(name, age, idEmployee, salary);
	}
	
	@Override
	public void mostrarTipo() {
		System.out.println("El empleado " + this.getName() + " is permanent");
	}
}
