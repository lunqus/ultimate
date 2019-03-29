package javasyntax.encapsulation;

public class Person {

    private String name, password;
    private int userName;
    private double money;


    public Person(String $Name, int $userName, String $password) {
        name        = $Name;
        userName    = $userName;
        password    = $password;
    }

    public void setMoney(double $amount, String $password) {

        if (password.equals($password))
            money = $amount;
        else
            System.out.println("Your password is incorrect!");
    }

    public double getMoney() {

        return money;
    }
}
