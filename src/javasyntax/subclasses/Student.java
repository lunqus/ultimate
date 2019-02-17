package javasyntax.subclasses;

public class Student extends Person {

    private String mGpa;

    public Student(String studentName, String studentBirthDay, String gpa) {

        super(studentName, studentBirthDay);
        mGpa = gpa;
    }

//    @Override
//    public void printInfo() {
//        System.out.println("I am a " + name + " and I was born on " +  birthDay + " GPA: " + mGpa);
//    }
}
