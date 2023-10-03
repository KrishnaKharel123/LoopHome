import java.util.Scanner;

public class Calculator7
{

    public static void main(String[] args) {
        char symbol;
        double num1, num2, num3 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");      ////print first...like wise
        num1 = input.nextDouble();
        System.out.println("Enter second number");
        num2 = input.nextDouble();
        System.out.println("Enter  the symbol from these:*, +, -, /");
        symbol = input.next().charAt(0);       ///variable

        calculate(symbol, num1, num2,num3);
    }

    public static void calculate(char symbol, double num1, double num2, double result) {



        switch (symbol) {      ////Switch branch

            case '+' :
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);// add numbers when + is entered
                break;
            case '-' :
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);// subtract numbers when - is entered
                break;
            case '*' :
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);// multiplication
                break;
            case '/' :
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);// division
                break;
            default :
                System.out.println("Invalid Entry");
                break;

        }
    }
}



