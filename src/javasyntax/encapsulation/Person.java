package javasyntax.encapsulation;

public class Person {

    private String name, password;
    private int userName;
    private double money;


    public Person(String name, int userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
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
