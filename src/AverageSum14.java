import java.util.Scanner;

public class AverageSum14 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  ////create a scanner
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();      ////variable

        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2; ////calculate the sum of two number
        double average=sum/2;

        System.out.println("The sum is " + sum);    ///display the sum
        System.out.println("The average is " + average);  ///display the average



        }




    }
