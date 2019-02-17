package javasyntax.subclasses;

public class Student extends Person {

    private String mGpa;

    public Student(String studentName, String studentBirthDay, String gpa) {

        super(studentName, studentBirthDay);
        mGpa = gpa;
    }

    @Override
    public void printInfo() {
        System.out.println("I am a " + getName() + " and I was born on " +  getBirthDay() + " GPA: " + mGpa);
    }
}
