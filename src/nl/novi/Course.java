package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Course {

     private String name;
     private String abbreviation;
     private List<Student> students;
     private Teacher teacher;

     public Course(String name, String abbreviation) {
         this.name = name;
         this.abbreviation = abbreviation;
         students = new ArrayList<>();
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void addStudent(Student newStudent) {
         if(checkIfUnique(newStudent)) {
             students.add(newStudent);
         }
    }

    private boolean checkIfUnique(Student newStudent) {
        for(Student studentFromList : students) {
            if(studentFromList.getStudentNumber().equals(newStudent.getStudentNumber())) {
                return false;
            }
        }
        return true;
    }

    public List<Student> getStudents() {
         return students;
    }
}
