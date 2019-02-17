package javasyntax.encapsulation;

public class EncapsulationMain {

    public static void main(String[] args) {


        String user1 = "Sammy";
        String user2 = "Claudy";
        String user3 = "Monroe";

        int age1 = 15, age2 = 22, age3 = 33;

        Person person1 = new Person(user1, age1, "pass1");
        Person person2 = new Person(user2, age2, "pass2");
        Person person3 = new Person(user3, age3, "pass3");

//        person1.money = 100;
//        person2.money = 5;
//        person3.money = 55;
//        person1.money += 20;
//        System.out.println(person1.money);

        person1.setMoney(100, "pass1");
        person2.setMoney(5, "pass12");
        person3.setMoney(55, "passsss");

        System.out.println(person1.getMoney());
    }

}
