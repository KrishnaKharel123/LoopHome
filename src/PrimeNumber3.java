import java.util.Scanner;

public class PrimeNumber3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");                      //user to enter a number
        int num = scanner.nextInt();                               ///user's input as an integer
        if (num < 2)
        {                                                           //// Check if the number is less than 2
            System.out.println(num + " is not a prime number.");
            return;
        }
        boolean number = true;

        for (int i = 2; i * i <= num; i++)            //loop from square root of the number
        {
            if (num % i == 0)  //// If the number is divisible by any integer in this range, it's not prime
            {
                number = false;

                break;                 // If it's divisible, it's not prime
            }
        }
        if (number) {   /// variable to determine if the number is prime or not
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}




