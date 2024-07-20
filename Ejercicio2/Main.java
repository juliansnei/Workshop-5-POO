package Ejercicio2;

public class Main {
	public static void main(String[] arg) {
		//Creamos el gestor
		GestionEmpleados gestion1 = new GestionEmpleados();
		
		//Creamos varios tipos de empleados
		EmpleadoTemporal empleado1 = new EmpleadoTemporal("Julio", 34, "errty677", 1200000.00);
		EmpleadoTemporal empleado2 = new EmpleadoTemporal("Marcos", 25, "ergg7700?", 2600000.00);
		EmpleadoTemporal empleado3 = new EmpleadoTemporal("Carlas", 45, "__tyhk,,", 3700000.00);
		EmpleadoTemporal empleado4 = new EmpleadoTemporal("Cristian", 18, "dfffdc334", 1234500.00);
		
		EmpleadoPermanente empleado5 = new EmpleadoPermanente("Esteban", 67, "cccccc", 1200000.00);
		EmpleadoPermanente empleado6 = new EmpleadoPermanente("Miguel", 29, "errty677", 2600000.00);
		EmpleadoPermanente empleado7 = new EmpleadoPermanente("Fernando", 59, "udududud", 1234500.00);
		EmpleadoPermanente empleado8 = new EmpleadoPermanente("Mario", 21, "@@@effg", 50000.00);
		
		//Con el gestor llamamos al metodo toAddemployee que me agrega cada empleado al array
		//sino tiene un id repetido respecto a otros empleados
		gestion1.toAddEmployee(empleado1);
		gestion1.toAddEmployee(empleado2);
		gestion1.toAddEmployee(empleado3);
		gestion1.toAddEmployee(empleado4);
		gestion1.toAddEmployee(empleado5);
		gestion1.toAddEmployee(empleado6); //Miquel tiene el mismo Id que Julio por eso no se agrega
		gestion1.toAddEmployee(empleado7);
		gestion1.toAddEmployee(empleado8);
		
		System.out.println();
		//Vemos el contenido del gestor de empleados
		gestion1.toShowEMployees();
		
		System.out.println();
		//Removemos varios empleados con el metodo toRemoveEmployees
		gestion1.toRemoveEmployee(empleado6); // Este empleado no esta en la base de datos por lo que me imprime otro mensaje
		gestion1.toRemoveEmployee(empleado7);
		gestion1.toRemoveEmployee(empleado8);
		
		System.out.println();
		//Volvemos a mostrar los empleados para comprobar
		gestion1.toShowEMployees();
		
		System.out.println();
		//Finalmente mostramos el polimorfismo, el metodo mostrarTipo se definio en la clase Empleado 
		//y se sobreescribio en EmpledoPermanente y EmpleadoTemporal
		empleado4.mostrarTipo();
		empleado5.mostrarTipo();
	}
}
