package labwork;

public class Department {

    public String name;

    public Department(String name) {
        this.name = name;
    }

    public void addInstructor(String name) {
        Instructor newInstructor = new Instructor(name);
    }

    public void removeInstructor(String name) {
    }
}
