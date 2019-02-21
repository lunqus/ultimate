package javasyntax.encapsulation;

public class Person {

    private String name, password;
    private int userName;
    private double money;


    public Person(String pName, int pUserName, String pPassword) {
        name = pName;
        userName = pUserName;
        password = pPassword;
    }

    public void setMoney(double newAmount, String pass) {

        if (password.equals(pass))
            money = newAmount;
        else
            System.out.println("Your password is incorrect!");
    }

    public double getMoney() {

        return money;
    }
}
