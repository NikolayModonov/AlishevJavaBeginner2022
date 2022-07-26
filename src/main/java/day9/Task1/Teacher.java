package day9.Task1;

public class Teacher extends Human {
    private String classRoom;

    public Teacher(String name, String classRoom) {
        super(name);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}