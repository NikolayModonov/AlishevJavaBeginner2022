package day7;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        String grade;
        int points = random.nextInt(4) + 2;
        switch (points) {
            case 2:
                grade = "BAD";
                break;
            case 3:
                grade = "NOT BAD";
                break;
            case 4:
                grade = "GOOD";
                break;
            case 5:
                grade = "EXCELLENT";
                break;
            default:
                grade = "NO VALUE for " + points;
        }

        System.out.println("Teacher " + name +
                " evaluated student " + student.getName() +
                " for subject " + subject +
                " on " + grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
