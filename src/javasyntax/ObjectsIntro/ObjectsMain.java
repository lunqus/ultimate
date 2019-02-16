package javasyntax.ObjectsIntro;

public class ObjectsMain {

    public static void main(String[] args) {

        String user1 = "Lucy";
        String user2 = "Joey";
        String user3 = "Willy";

        int age1 = 10, age2 = 20, age3 = 30;

        Person person1 = new Person(user1, age1);
        System.out.println(person1.userName + " " + person1.userAge);

        Person person2 = new Person(user2, age2);
        System.out.println(person2.userName + " " + person2.userAge);

        Person[] personArray = new Person[10];


        for (int i = 0; i < personArray.length; i++) {

            personArray[i] = new Person("TomTom", i);
        }
        for (int i = 0; i < personArray.length; i++) {

            System.out.println(personArray[i].userName + " " + personArray[i].userAge);
        }

    }

}
