package labwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        University bstu = new University("БГТУ им. В.Г. Шухова", "ул. Костюкова 15", 485485);
        University bsu = new University("БелГУ", "ул. Победы 104", 999888);

        Department it = bstu.addDepartament("Кафедра информационных технологий", bstu);
        Department povtas = bstu.addDepartament("Кафедра ПОВТАС", bstu);
        Department robototech = bstu.addDepartament("Кафедра робототехники", bstu);
        Department managment = bsu.addDepartament("Кафедра менеджмента", bsu);
        Department math = bsu.addDepartament("Кафедра математики", bsu);
        Department informatic = bsu.addDepartament("Кафедра информатики", bsu);

        System.out.println();

        Instructor elenaDercgach = it.addInstructor("Елена Дергач", it);
        Instructor pavelIvanov = it.addInstructor("Павел Иванов", it);
        Instructor ilyaViktorov = it.addInstructor("Илья Викторов", it);

        System.out.println();

        bstu.getDepartment(it);
        bstu.getAllDepartment(bstu);
        bstu.removeDepartment(povtas, bstu);
        bstu.getAllDepartment(bstu);

        System.out.println();

        it.getInstructor(elenaDercgach);
        it.getAllInstructor(it);
        it.removeInstructor(pavelIvanov, it);
        it.getAllInstructor(it);

        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите имя и фамилию преподавателя");

        String instructorName = console.nextLine();

        Instructor newInstructor = it.addInstructor(instructorName, it);

        it.getAllInstructor(it);
    }
}
