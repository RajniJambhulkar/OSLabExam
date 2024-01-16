package sumofdigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Display the result
        System.out.println("Sum of digits: " + sum);
    }
}

