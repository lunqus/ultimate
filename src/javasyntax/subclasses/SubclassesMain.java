package javasyntax.subclasses;

public class SubclassesMain {

    public static void main(String[] args) {


        Student student1 = new Student("Willy", "April 20, 2000", "8.0");
        student1.printInfo();

        Teacher teacher1 = new Teacher("Sally", "March 19, 1998");
        teacher1.printInfo();
    }


}
