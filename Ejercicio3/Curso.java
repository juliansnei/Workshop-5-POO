package Ejercicio3;

import java.util.ArrayList;

public class Curso {
	private String codeCourse;
	private String nameCourse;
	private ArrayList<Estudiante> students;

	public Curso(String codeCourse, String nameCourse) {
		this.codeCourse = codeCourse;
		this.nameCourse = nameCourse;
		students = new ArrayList<>();
	}
	
	//Me recibe un parametro de instancia a la clase Estudiante
	// si el estudiante ya existe (lo averiguo con el metodo findStudentById())
	//si no existe lo agrego al array
	public void toAddAnStudentById(Estudiante student) {
		boolean studentFound = findStudentById(student.getId());
		if(studentFound) {
			System.out.println("The student " + student.getName()  + " already exist in the Course");
		} else {
			students.add(student);
			System.out.println("The student " + student.getName() + " has been added to the course " + this.nameCourse);
		}
	}
	
	//Busca si el estudiante ya existe por medio de su Id
	public boolean findStudentById(String studentId) {
		boolean studentFound = false;
		for(Estudiante student: students) {
			if(student.getId() == studentId) {
				studentFound = true;
				break;
			}
		}
		return studentFound;
	}
	
	//Me lista los estudiantes del curso
	public void toListStudents() {
		if(students.size() > 0) {
			System.out.println("This is the list of the students enrrolled in " + this.nameCourse + ":");
			for(Estudiante student: students) {
				System.out.println("Student name: " + student.getName() + ", Student Id: " + student.getId() + ", Email: " + student.getEmail());
			}
		} else {
			System.out.print("There are not students enrrolled in " + this.nameCourse);
		}
		
	}
	
	public String getCodeCourse() {
		return codeCourse;
	}
	
	public void setCodeCourse(String codeCourse) {
		this.codeCourse = codeCourse; 
	}
	
	public String getNameCourse() {
		return nameCourse;
	}
	
	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}
}
