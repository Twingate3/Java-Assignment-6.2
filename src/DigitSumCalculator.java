public class DigitSumCalculator {
    public static int sumDigits(long n) {
        int sum = 0;

        // Convert the number to positive if it's negative
        n = Math.abs(n);

        while (n > 0) {
            // Extract the last digit and add it to the sum
            sum += (int)(n % 10);

            // Remove the last digit from the number
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test program
        System.out.println("Enter a number to calculate the sum of its digits:");
        java.util.Scanner input = new java.util.Scanner(System.in);

        long number = input.nextLong(); // Accept input from the user
        System.out.println("The sum of the digits is: " + sumDigits(number));
    }
}
