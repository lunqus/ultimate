package javasyntax;

public class Functions {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int add = a + b;
        System.out.println(add);

        int tot = add(2,4);
        System.out.println("Total: " + tot);

        boolean isPrime = isNumberPrime(7);
        System.out.println(isPrime);

    }

    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static boolean isNumberPrime(int a) {

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {

                return false;
            }
        }

        return true;
    }
}
