import java.util.Scanner;

public class MultiplicationTable10
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any Number");
        int num= scanner.nextInt();


        for (int i =1; i <=10; i++){         ///loop

            System.out.println(num+"*" + i+ "=" +num * i);
        }



    }



}
