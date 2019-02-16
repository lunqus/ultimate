package javasyntax;

public class ifStatements {

    public static void main(String[] args) {

        if (4 == 3) {
            System.out.println("We are inside our if statement");
        } else {

            System.out.println("We are inside else statement");
        }


        double defaultTicketPrice = 10.0;
        double discout = .1;
        double ticketPrice = defaultTicketPrice;
        int age = 26;

        if (age < 18) {
            ticketPrice = ticketPrice - ticketPrice * discout;
        } else if ( age < 25 ) {
                ticketPrice = ticketPrice - ticketPrice * discout/2;
            }

        System.out.println(ticketPrice);

    }
}
