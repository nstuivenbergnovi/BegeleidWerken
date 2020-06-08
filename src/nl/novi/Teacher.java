package nl.novi;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }
}
