import java.util.Scanner;

public class ProbableTopperNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        int sumOfOddDigits = 0, sumOfEvenDigits = 0;
        boolean isProbableTopperNumber = true;
        while (number > 0) {
            int digit = (int) (number % 10);
            if (digit % 2 == 0) {
                sumOfEvenDigits += digit;
            } else {
                sumOfOddDigits += digit;
            }
            number /= 10;
        }
        if (sumOfOddDigits != sumOfEvenDigits) {
            isProbableTopperNumber = false;
        }
        if (isProbableTopperNumber) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}