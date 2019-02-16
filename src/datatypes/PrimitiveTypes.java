package datatypes;

public class PrimitiveTypes {

    public static void main(String[] args) {

        byte myByte = 2;            // 8 Bit (-127 - +127)
        short myShort = 5;          // 16 Bit (2 x byte)
        int myInt = 20;             // 32 bit
        long myLong = 123;          // 64 Bit
        float myFloat = 3.6f;       // 32 Bit
        double myDouble = 456.44;   // 64 bit
        boolean myBool = true;      // 16 Bit - ?
        char myChar = 'A';          // 8 Bit - ?


        int sum = (int) (myInt + myDouble); // 40.25 --> 40

        boolean isRainy = true; // 0 = false, 1 = true
        if (myBool) {
            System.out.println("You need an umbrella");
        }

        int nine = 9;
        char otherChar = 'A';
        // A ---> 000001111 -------> number 57 ------> A
        // 9 -----> number 37 ------> 000001 (example)
        // number 9 -----> 00001001

        int mappedVal = (int) otherChar;
        System.out.println(mappedVal); // prints -----> 57

        char s = 's';
        char i = 'i';
        char g = 'g';

        int maps = (int) s;
        int mapi = (int) i;
        int mapg = (int) g;

        System.out.println(maps + " " + mapi + " " + mapg + " " + mapi + " " + maps);

        int d = 865;
        int si = 115;

        char prefix = (char) d;

        System.out.println(prefix);

        int f = 20;
        double r = 22;

        double rez = f / r;
        System.out.println(rez);

    }
}
