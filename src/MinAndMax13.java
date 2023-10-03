import java.util.Scanner;

public class MinAndMax13
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first Number");
        int num1 =scanner.nextInt();     ////maximum of num

        System.out.println("Enter second Number");
        int num2 =scanner.nextInt();

        System.out.println("Enter third Number");
        int num3 =scanner.nextInt();

        int i = Math.max(num1,num2);
        i=Math.max(i,num3);

        int j = Math.min(num1,num2);
        j= Math.min(j,num3);    ///find the minimum of mini 1

        System.out.println("The highest number is " +i);
        System.out.println("The Lowest  number is " +j);

    }




}
