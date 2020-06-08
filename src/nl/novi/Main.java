package nl.novi;

import java.util.List;

public class Main {

    public static void main(String[] args) {

	    Student student = new Student();
	    student.setName("Nick Stuivenberg");
	    student.setEmail("nstuivenberg@novi.nl");
	    student.setStudentNumber("613603");
		student.setEcts(0);

		Student kees = new Student();
		kees.setName("Kees");
		kees.setEmail("kees@kees.nl");
		kees.setEcts(12);
		kees.setStudentNumber("121212");

		Student neppeKees = new Student();
		neppeKees.setName("Kees");
		neppeKees.setEmail("kees@kees.nl");
		neppeKees.setEcts(12);
		neppeKees.setStudentNumber("121212");

		Student nieuweKees = new Student("Kees", "789456" ,
				"keesie@keesie.nl" ,30);

        Course nederlands = new Course("Nederlands","NLD");

        nederlands.addStudent(student);
        nederlands.addStudent(kees);
        nederlands.addStudent(neppeKees);

        List<Student> nederlandseStudenten = nederlands.getStudents();

        for(Student studentFromList: nederlandseStudenten) {
			System.out.println("Naam: " + studentFromList.getName());
		}

        Teacher teacher = new Teacher("Dennis");



        // Drie klasse
        // Main
        // Student
        // Course
        // Teacher3


        // Getter en setters
        // Relaties
        // Klasse met new aanmaakt en dan de methodes gebruikt uit die klasse
        // public, private en protected
        // Verschil static en non static
		//Boter kaas en eieren vergelijken
    }
}
