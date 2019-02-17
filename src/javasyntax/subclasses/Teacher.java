package javasyntax.subclasses;

public class Teacher extends Person{

    public Teacher(String teacherName, String teacherBirthDay) {

        super(teacherName, teacherBirthDay);
    }

    @Override
    public void printInfo() {
        System.out.println("I am a Teacher ");
    }
}
