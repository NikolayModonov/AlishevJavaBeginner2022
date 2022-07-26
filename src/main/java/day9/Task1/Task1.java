package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Boris", "M-348");
        Teacher teacher = new Teacher("Olga","Math");
        System.out.println(student.getEducationGroup());
        System.out.println(teacher.getClassRoom());
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();
    }
}
