package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("John Smith");
        Teacher teacher = new Teacher("Smith John", "Math");

        teacher.evaluate(student);
    }
}
