package day9.Task1;

public class Student extends Human {
    private String educationGroup;

    public Student(String name, String educationGroup) {
        super(name);
        this.educationGroup = educationGroup;
    }

    public String getEducationGroup() {
        return educationGroup;
    }

    public void setEducationGroup(String educationGroup) {
        this.educationGroup = educationGroup;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
