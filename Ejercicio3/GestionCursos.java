package Ejercicio3;

import java.util.ArrayList;

public class GestionCursos {
	private ArrayList<Curso> courses;
	
	public GestionCursos() {
		courses = new ArrayList<>();
	}
	
	//Este metodo me añade un curso al array llamado courses
	//pero primero me verifica que el código del curso no este 
	//repetido en el array con el metodo toFindCourse()
	public void toAddCourse(Curso curso) {
		boolean toFindCourse = toFindCourse(curso.getCodeCourse());
		if(!toFindCourse) {
			courses.add(curso);
			System.out.println("The " + curso.getNameCourse() + " has been added.");
		} else {
			System.out.println("The " + curso.getNameCourse() + " course code already exists, please change it to add a new course");
		}
		
	}
	
	//Este metodo me busca si hay un curso existente en el array por el nombre
	//no se utiliza debido a que es más seguro con el código. Este metodo es polimorfico
	public boolean toFindCourse(Curso courseToFind) {
		boolean courseFound = false;
		for(Curso course: courses) {
			if(courseToFind.getNameCourse().equalsIgnoreCase(course.getNameCourse())) {
				courseFound = true;
				break;
			}
		}
		System.out.print("The search was done with an instance  -  ");
		return courseFound;
	}
	
	//Este metodo me busca si hay un curos existente buscando 
	//compatibilidad con el código del curso, es más seguro ya que
	//el nombre del curso se puede repetir, pero el código no,
	//es el otro metodo polimorfico diferenciado por los parametros que recibe
	public boolean toFindCourse(String courseCode) {
		boolean courseFound = false;
		for(Curso course: courses) {
			if(courseCode.equalsIgnoreCase(course.getCodeCourse())) {
				courseFound = true;
				break;
			} 
		}
		return courseFound;
	}
	
	//Me añade un estudiante a un curso en especifico, recibe la instancia del
	//estudiante que quiera agregas y el código del curso, dentro del metodo
	//me recorre el array de cursos comparando el código hasta que lo haya y lo agrega
	//manda a llamar un metodo de la clase curso para agregarlo llamada toAddAnStudentById
	public void toAddStudentInACourseByCode(String courseCode, Estudiante student) {
		boolean found = toFindCourse(courseCode);
		if(found) {
			for(Curso course: courses) {
				if(course.getCodeCourse() == courseCode) {
					course.toAddAnStudentById(student);
					break;
				}
			}
		} else {
			System.out.println("The course code doesn't exist, you can create it first");		}
	}
	
	//Este metodo me recibe el codigo del curso y se asegura de que exista
	//luego manda a llamar el metodo de la clase Curso toListStudents()
	//para listar los estudiantes
	public void toListStudentsInACourse(String courseCode) {
		boolean courseFound = toFindCourse(courseCode);
		if(courseFound) {
			for(Curso course: courses) {
				if(course.getCodeCourse().equalsIgnoreCase(courseCode)) {
					course.toListStudents();
					break;
				}
			}
		} else {
			System.out.println("That course doesn't exists");
		}
	}
	
	//Remueve el curso
	public void toRemoveCourse(Curso curso) {
		boolean courseFound = toFindCourse(curso);
		if(courseFound) {
			courses.remove(courses.indexOf(curso));
			System.out.println("The " + curso.getNameCourse() + " has been removed");
		} else {
			System.out.println("That course doesn't exists");
		}
	}
	

	
	
	public ArrayList<Curso> getCourses(){
		return courses;
	}
	
}
