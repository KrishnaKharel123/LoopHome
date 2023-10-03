import java.util.Scanner;



public class FactorialNumber5
{
    public static void main(String[] args)
    {
       int number = 5;    ////intilaize the variable
        Scanner scanner = new Scanner(System.in);   ///create a scanner
        System.out.println("Enter the Number");
        number = scanner.nextInt();
        long factorial = 1;      ////long is used to handle larger factorial value



        for (int i = 1; i <= number; i++)  ////for loop
        {
            factorial *= i;   ////multiply factorial 'i' each iteration
        }
        System.out.println("Factorial of " + number + " is " + factorial);


    }
}


