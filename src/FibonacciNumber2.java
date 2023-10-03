import java.util.Scanner;

public class FibonacciNumber2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);   ///scanner object to read user
        System.out.println("Enter the limit 'n':"); ///user to enter a limit 'n '
        int n = scanner.nextInt();                  ////input value 'n ' from user
        int first = 1;                              /// intialize the first two Fibonacci numbers.
        int second = 1;
        System.out.println("Fibonacci sequence up to " + n + " :");////message indicating the limit enetered by user

        for (int i = 1; i <= n; i++) ///loop to generate and print fibonacci number
        {
            System.out.println(first + "  ");

            int next = first + second;
            first = second;     ///update the value of first and second for the iteration
            second = next;
        }



    }

}
















