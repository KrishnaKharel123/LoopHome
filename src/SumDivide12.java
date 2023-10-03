import java.util.Scanner;

public class SumDivide12
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

// Input starting number 'a'
    System.out.print("Enter the starting number : ");
    float a = scanner.nextFloat();

// Input ending number 'b'
    System.out.print("Enter the ending number : ");
    float b = scanner.nextFloat();

    float sum = 0;

        for (float i = a; i <= b; i++) {
            if (i % 9 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of numbers between " + a + " and " + b + " divisible by 9 is: " + sum);

    }
}







