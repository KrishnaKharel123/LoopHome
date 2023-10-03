import java.util.Scanner;

public class Sum8
{
    public static void main(String[] args)
    {
        int num;     ///variables
        int sum=0;
        Scanner scanner= new Scanner(System.in);


        System.out.println("Enter the Num 1");
        int num1 =scanner.nextInt();

        System.out.println("Enter the Num 2");
        int num2 =scanner.nextInt();

        for(int i=num1;  i<=num2; i++) {   ////loop
            sum = sum + i;

           System.out.println("The sum  range of " +i+ " is " +(sum));



    }




    }
}

