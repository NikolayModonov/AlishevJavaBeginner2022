package day7;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("John Smith");
        Teacher teacher = new Teacher("Smith John","Math");

        teacher.evaluate(student);

    }
}