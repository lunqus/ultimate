package datatypes;

public class SwitchStatement {

    public static void main(String[] args) {

        double defaultTicketPrice = 10.0;
        double discout = .1;
        double ticketPrice = defaultTicketPrice;
        int age = 26;
        int switchVar = 6;

        switch (switchVar)
        {
            case 4:
                System.out.println("We are now inside case: 4");
                break;
            case 3:
                System.out.println("We are now inside case: 3");
                break;
            case 2:
                System.out.println("We are now inside case: 2");
                break;
            case 1:
                System.out.println("We are now inside case: 1");
                break;
            default:
                System.out.println("We are now inside default: " + switchVar);

        }
    }
}
