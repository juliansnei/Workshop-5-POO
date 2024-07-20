package Ejercicio2;

import java.util.ArrayList;

public class GestionEmpleados {
	private ArrayList<Empleado> empleados;
	
	public GestionEmpleados() {
		empleados = new ArrayList<Empleado>();
	}

	public void toAddEmployee(Empleado empleado) {
		boolean employeeFound = toFindEmployees(empleado.getIdEMployee());
		if(!employeeFound) {
			empleados.add(empleado);
			System.out.println("The Employee called " + empleado.getName() + " was added");
		} else {
			System.out.println("The employee " + empleado.getName() + " cannot be added because there is another employee with the same Id");
		}
		
	}
	
	public void toRemoveEmployee(Empleado empleado) {
		boolean employeeFound = toFindEmployees(empleado.getIdEMployee());
		if(employeeFound) {
			empleados.remove(empleado);
			System.out.println("The Employee called " + empleado.getName() + " was remove");
		} else {
			System.out.println("This employee cannot be remove, his Id doesn't appear in the database");
		}	
	}
	
	public void toShowEMployees() {
		for(Empleado empleado: empleados) {
			System.out.println("Nombre: " + empleado.getName() + ", Edad: " + empleado.getAge() + ", Id: " + empleado.getIdEMployee() + ", Salario: " + empleado.getSalary() + "$");
		}
	}
	
	public boolean toFindEmployees(String employeeId) {
		boolean employeeFound = false;
		for(Empleado employee : empleados) {
			if(employee.getIdEMployee().equals(employeeId)) {
				employeeFound = true;
				break;
			}
		}
		return employeeFound;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
}
