import java.util.Scanner;

public class Print10Numbers1
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);      ///user access
        System.out.println("Enter the First number");
        int num1 = scanner.nextInt();                ////variable

        System.out.println("Enter the Second number");
        int num2 = scanner.nextInt();
        printNumber(num1,num2);         ////method to print numbers
    }

        public static void printNumber(int num1, int num2 )
        {
            for (int i = num1; i <= num1 + 10; i++)   ///loop condition
            {
                System.out.println(i);
        }

    }





}
