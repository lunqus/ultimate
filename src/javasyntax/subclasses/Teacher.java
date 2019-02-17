package javasyntax.subclasses;

public class Teacher extends Person{

    private String school;
    private double salary;

    public Teacher(String teacherName, String teacherBirthDay, String teacherSchool, double teacherSalary) {

        super(teacherName, teacherBirthDay);

        school = teacherSchool;
        salary = teacherSalary;
    }

    @Override
    public void printInfo() {
        System.out.println("I am a Teacher " + getName() + " from School " + school + " with salary: " + salary + ", born: " + getBirthDay());
    }
}
