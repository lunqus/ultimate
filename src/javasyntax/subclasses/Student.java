package javasyntax.subclasses;

import java.util.Date;

public class Student extends Person {

    private double mGpa;
    private Assignment mCurrentAssigment;

    public Student(String studentName, String studentBirthDay, double gpa) {

        super(studentName, studentBirthDay);
        mGpa = gpa;
    }

    @Override
    public void printInfo() {
        System.out.println("I am a " + getName() + " and I was born on " +  getBirthDay() + " GPA: " + mGpa);
    }

    public void printAssignmentInfo() {

        if (mCurrentAssigment != null) {
            System.out.println(mCurrentAssigment.getName() + ", " + mCurrentAssigment.getAssignmentDueDate());
        }
    }

    @Override
    public String toString() {
        return getName() + " " + mGpa;
    }

    public void setCurrentAssigment(Assignment assignment) {
        mCurrentAssigment = assignment;
    }

    public void setmCurrentAssigment(String assignmentName) {
        mCurrentAssigment = new Assignment(assignmentName, "Default name", new Date());
    }
}
