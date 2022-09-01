package labwork;

import java.util.ArrayList;

public class University {

    public String name;
    public String address;
    public int number;
    public ArrayList<Department> departmentList = new ArrayList<>();
    public ArrayList<Student> studentList = new ArrayList<>();

    public University(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Student addStudent(String name, int studentId) {
        Student student = new Student(name, studentId);
        studentList.add(student);

        return student;
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public void getStudent(Student student) {
        System.out.println();
        System.out.println("name: " + student.name + ", studentID: " + student.studentId);
    }

    public Department addDepartament(String name, University university) {
        Department department = new Department(name);
        departmentList.add(department);
        System.out.println("В университете " + university.name + " была сформирована " + department.name);

        return department;
    }

    public void removeDepartment(Department department, University university) {
        System.out.println();
        System.out.println("В университете " + university.name + " была расформирована " + department.name);
        departmentList.remove(department);
    }

    public void getDepartment(Department department) {
        System.out.println();
        System.out.println(department.name);
    }

    public void getAllDepartment(University university) {
        System.out.println();
        int i = 0;
        System.out.println("Список кафедр в университете " + university.name + ": ");
        for (Department department : departmentList) {
            i++;
            System.out.println(i + ". " + department.name);
        }
        System.out.println("Кафедр в университете всего: " + i);
    }
}
