package Ejercicio2;

public class Empleado extends Persona {
	private String idEmployee;
	private Double salary;
	public Empleado(String name, Integer age, String idEmployee, Double salary) {
		super(name, age);
		this.idEmployee = idEmployee;
		this.salary = salary;
	}
	
	public void mostrarTipo() {
		
	}
	
	public String getIdEMployee() {
		return idEmployee;
	}
	
	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
