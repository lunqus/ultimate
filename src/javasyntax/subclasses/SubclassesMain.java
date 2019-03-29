package javasyntax.subclasses;

import java.util.Date;

public class SubclassesMain {

    private static Object Assignment;

    public static void main(String[] args) {


        Student student1 = new Student("Willy", "April 20, 2000", 8.0);
        student1.printInfo();

        Teacher teacher1 = new Teacher("Sally", "March 19, 1998", "UCLA", 90000);
        teacher1.printInfo();

        Teacher teacher2 = new Teacher("Wendy", "Feb 2, 1980", "Caltech", 90000);
        teacher2.printInfo();

        System.out.println("");

        Person[] myPersonArray =
                {
                        new Student("Don", "Apr 25, 2000", 9.0),
                        new Teacher("Zigma", "Mar 2, 1985", "Vilnius", 10000)
                };

        for (int i = 0; i < myPersonArray.length; i++) {

            myPersonArray[i].printInfo();
        }

        System.out.println("");

        Date mAssgnmentDueDate = new Date();
        Assignment joeyAssignment = new Assignment("Calculus Homework", "Calculus", mAssgnmentDueDate);

        Student joey = new Student("Joey", "20/05/1970", 5.0);
        joey.setCurrentAssigment(joeyAssignment);
        joey.printAssignmentInfo();
        System.out.println(joey.toString());
        joey.setmCurrentAssigment("Biology project");
        joey.printAssignmentInfo();
    }
}
