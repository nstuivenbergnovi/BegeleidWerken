package nl.novi;

public class Student {

    private String name;
    private String studentNumber;
    private String email;
    private int ects;

    public Student() {
    }

    public Student(String name, String studentNumber, String email, int ects) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.email = email;
        this.ects = ects;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String maakMooieRegel() {
        String mooieRegelTekst = "";
        mooieRegelTekst += name + " (" + studentNumber + ") en email: "
                + email + " heeft " + ects + " studiepunten.";
        return mooieRegelTekst;
    }
}
