package Ejercicio3;

public class Main {
	public static void main(String[] arg) {
		//Creo la instancia del gestor de cursos
		GestionCursos gestion1 = new GestionCursos();
		
		//Creo varios cursos individuales, pueden tener el mismo nombre y código
		//pero si tienen el mismo código no lo gestionara el gestor
		Curso curso1 = new Curso("1234rty","Matematicas 1");
		Curso curso2 = new Curso("345677","Matematicas 2");
		Curso curso3 = new Curso("345fjg_","Ingles 1");
		Curso curso4 = new Curso("vulvbn78","Ingles 2");
		Curso curso5 = new Curso("nm,.{67","Fisica 1");
		Curso curso6 = new Curso("2ssdd112","Desarrollo de software");
		Curso curso7 = new Curso("2ssdd112","Desarrollo de software 2");
		Curso curso8 = new Curso("34dcccv","Desarrollo de software");
		
		//Aquí añado al gestor los distintos cursos, pero solo me añadira
		//los cursos que tienen distinto id, si tienen el mismo id, mandara
		//un mensaje advirtiendolo
		gestion1.toAddCourse(curso1);
		gestion1.toAddCourse(curso2);
		gestion1.toAddCourse(curso3);
		gestion1.toAddCourse(curso4);
		gestion1.toAddCourse(curso5);
		gestion1.toAddCourse(curso6);
		gestion1.toAddCourse(curso7); //Este curso 7 no me lo añadira porque tiene el mismo id que curso6
		gestion1.toAddCourse(curso8);
		
		System.out.println();
		System.out.println("------The courses manager has the following courses:");
		//Me muestra los cursos que tiene el gestor1 para comprobar cuales añadio
		for(Curso curso : gestion1.getCourses()) {
			System.out.println("Name: " + curso.getNameCourse() + ", Course Code: " + curso.getCodeCourse());
		}
		
		//Me creo varios estudiantes, pueden tener el mismo nombre y id 
		Estudiante estudiante1 = new Estudiante("Julian", "123ert", "julian@gmail.com");
		Estudiante estudiante2 = new Estudiante("Juan", "345rty", "juan@gmail.com");
		Estudiante estudiante3 = new Estudiante("Michael", "123ert", "mike34"); //Como tiene el mismo Id que estudiante1 no me lo agregara al mismo curso donde inscriba a estudiante1
		Estudiante estudiante4 = new Estudiante("Julian", "dfghh789", "julian@gmail.com");
		Estudiante estudiante5 = new Estudiante("Peter", "pety78", "peter@gmail.com");
		Estudiante estudiante6 = new Estudiante("Harry Potter", "xxxyyy", "potter@gmail.com");
		Estudiante estudiante7 = new Estudiante("Carlangas", "---ghj", "carlitos-@gmail.com");
		Estudiante estudiante8 = new Estudiante("Juanquiqui", ".h.j.k", "juanelmejor@gmai.com");
		Estudiante estudiante9 = new Estudiante("Pedronel", "idforpedro", "destroyes@df.com");
		Estudiante estudiante10 = new Estudiante("Maputre", "idformap", "map@hotmail.com");
		
		System.out.println();
		//Ahora con el gestor los voy a agregar al curso que desee, para esto
		//mando a llamar el metodo toAddStudentInACourseByCode() que me recibe dos parametros
		//el primero es el código del curso y el segundo es la instancia del estudiante que
		//quiera añadir al curso, si hay estudiantes repetidos, el metodo no me agrega el estudiante al curso
		//y me manda un mensaje advirtiendolo
		gestion1.toAddStudentInACourseByCode("1234rty", estudiante1);
		gestion1.toAddStudentInACourseByCode("1234rty", estudiante2);
		gestion1.toAddStudentInACourseByCode("1234rty", estudiante3);//Aquí no me agrega el estudiante por tener el mismo Id que estudiante1 y me manda mensaje
		gestion1.toAddStudentInACourseByCode("345677", estudiante3);//Aquí si me lo agrega por inscribirse en otro curso donde estudiante2 no esta inscrito
		gestion1.toAddStudentInACourseByCode("345677", estudiante4);
		gestion1.toAddStudentInACourseByCode("345677", estudiante5);
		gestion1.toAddStudentInACourseByCode("345fjg_", estudiante4);
		gestion1.toAddStudentInACourseByCode("345fjg_", estudiante5);
		gestion1.toAddStudentInACourseByCode("345fjg_", estudiante1);
		gestion1.toAddStudentInACourseByCode("345fjg_", estudiante2);
		
		gestion1.toAddStudentInACourseByCode("vulvbn78", estudiante6);
		gestion1.toAddStudentInACourseByCode("vulvbn78", estudiante7);
		gestion1.toAddStudentInACourseByCode("nm,.{67", estudiante8);
		gestion1.toAddStudentInACourseByCode("nm,.{67", estudiante9);
		gestion1.toAddStudentInACourseByCode("2ssdd112", estudiante10);
		gestion1.toAddStudentInACourseByCode("2ssdd112", estudiante3);
		
		gestion1.toAddStudentInACourseByCode("34dcccv", estudiante10);
		gestion1.toAddStudentInACourseByCode("34dcccv", estudiante3);
		gestion1.toAddStudentInACourseByCode("34dcccv", estudiante8);
		gestion1.toAddStudentInACourseByCode("34dcccv", estudiante7);
		
		System.out.println();
		
		//Con el gestor se llama al metodo toListStudentsInACourse que me recibe 
		//el código del curso que quiero listar
		gestion1.toListStudentsInACourse("234edf");//Este no me lo lista, ya que dicho código no existe para ningún curso
		System.out.println();
		gestion1.toListStudentsInACourse("1234rty");
		System.out.println();
		gestion1.toListStudentsInACourse("345677");
		System.out.println();
		gestion1.toListStudentsInACourse("345fjg_");
		System.out.println();
		gestion1.toListStudentsInACourse("vulvbn78");
		System.out.println();
		gestion1.toListStudentsInACourse("nm,.{67");
		System.out.println();
		gestion1.toListStudentsInACourse("2ssdd112");
		
		System.out.println();
		
		//Ahora voy a llamar el metodo toFindCourse() para comprobar polimorfismo por parametro
		System.out.println(gestion1.toFindCourse(curso1));  //Es el mismo nombre de metodo pero aqui me imprime un mensaje adicional
		System.out.println(gestion1.toFindCourse("1234rty"));
	}

}
