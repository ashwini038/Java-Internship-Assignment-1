public class Main {

    // Method to find maximum of two numbers
    public static int findMax(int a, int b) {
        if (a > b)6
            return a;
        else
            return b;
    }
y
    // Method to check prime number
    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Maximum: " + findMax(10, 20));

        if (isPrime(7))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}