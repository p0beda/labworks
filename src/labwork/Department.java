package labwork;

import java.util.HashSet;
import java.util.Set;

public class Department {

    public String name;
    public Set<Instructor> instructorSet = new HashSet();

    public Department(String name) {
        this.name = name;
    }

    public Instructor addInstructor(String name, Department department) {
        System.out.println();
        Instructor instructor = new Instructor(name);
        instructorSet.add(instructor);
        System.out.println("На " + department.name + " появился новый преподаватель: " + instructor.name);

        return instructor;
    }

    public void removeInstructor(Instructor instructor, Department department) {
        System.out.println();
        System.out.println("С " + department.name + " был уволен преподаватель " + instructor.name);
        instructorSet.remove(instructor);
    }

    public void getInstructor(Instructor instructor) {
        System.out.println();
        System.out.println(instructor.name);
    }

    public void getAllInstructor(Department department) {
        System.out.println();
        int i = 0;
        System.out.println("Список преподавателей:");
        for (Instructor instructor : instructorSet) {
            i++;
            System.out.println(i + ". " + instructor.name);
        }
        System.out.println("На " + department.name + " работает " + i + " преподавателей");
    }
}
