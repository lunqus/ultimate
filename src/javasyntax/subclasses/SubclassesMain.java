package javasyntax.subclasses;

public class SubclassesMain {

    public static void main(String[] args) {


        Student student1 = new Student("Willy", "April 20, 2000", "8.0");
        student1.printInfo();

        Teacher teacher1 = new Teacher("Sally", "March 19, 1998", "UCLA", 90000);
        teacher1.printInfo();

        Teacher teacher2 = new Teacher("Wendy", "Feb 2, 1980", "Caltech", 90000);
        teacher2.printInfo();

        System.out.println("");

        Person[] myPersonArray =
                {
                        new Student("Don", "Apr 25, 2000", "9.0"),
                        new Teacher("Zigma", "Mar 2, 1985", "Vilnius", 10000)
                };

        for (int i = 0; i < myPersonArray.length; i++) {

            myPersonArray[i].printInfo();
        }
    }
}
