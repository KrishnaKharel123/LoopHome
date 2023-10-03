import java.util.Scanner;

public class ReverseNumber4
{
    public static void main(String[] args) {
        int number;
        int reversedNumber = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        number = scan.nextInt();

        for (; number != 0; number = number / 10) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversedNumber
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}


