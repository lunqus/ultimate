package javasyntax;

public class Strings {

    public static void main(String[] args) {

        char mychar = 'A';
        String myString = "Nancy Reagan"; // String is a sequence of chars.
        // Sequence of chars can be represented via an array


        String weirdInitialization = new String("Nancy Reagan");
        boolean areStringsSame = myString.equals(weirdInitialization); // Checking content of the block of memory

        if (areStringsSame) {
            System.out.println("Strings are the same!");
        } else {
            System.out.println("Strings aren't the same!");

        }

        boolean oho = (myString == weirdInitialization); // Checks if pointers myString & weirdInitialization points to
                                                        // the same location of memory and finds that they points to
                                                       // the different blocks of memory.
        System.out.println(areStringsSame); // true
        System.out.println(oho); // false

        // Strings are immutable

        String nonImmutableString = "Hello";
        nonImmutableString.replaceAll("l", "o"); // Should look like this: Heooo
        // It creates new block of memory [Heooo], but it never used without reasigning
        System.out.println(nonImmutableString); // Hello

        // To change string needed to reassign it and store to a variable
        nonImmutableString = nonImmutableString.replaceAll("l", "o");
        System.out.println(nonImmutableString); // Heooo
    }



}
