import java.util.Scanner;

public class NaturalNumber6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);   ///'user access
        System.out.println("Enter the value of 'n':");

        int n =(scanner.nextInt());
        int sum = 0;        ////variable

        for (int i = 1; i <= n; i++) {  ////loop
            sum += i;
        }
        System.out.println("sum of the first " + n + " natural number is: " + sum);

    }
}
