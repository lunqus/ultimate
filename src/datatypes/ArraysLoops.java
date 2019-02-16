package datatypes;

import java.util.Arrays;

public class ArraysLoops {

    public static void main(String[] args) {

        int [] myArray = new int[5]; // Creates 5 blocks of memory with values of 0 [0], [0], [0] ...

        int firstValue = myArray[0];

        myArray[0] = 20;
        myArray[1] = 30;
        myArray[2] = 2;
        myArray[3] = 4;
        myArray[4] = 50;

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            sum += myArray[i];

        }

        System.out.println(sum);

        Arrays.sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();

        String[] names = {"Joe", "Willy", "Sam", "Merry", "Frodo"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names) {

            System.out.print(name + " ");

        }
    }
}

