import java.util.Scanner;

public class DivisionPrint9 {
    public static void main(String[] args) {


        System.out.println(" Numbers divided by 5 ");

        for (int i = 1; i < 100; i++) {          ////loop use to divide by 5

            if (i % 5 == 0) System.out.println(i);


        }

        System.out.println("Numbers divided by 3 ");

        for (int i = 1; i < 100; i++) {         ///loop use

            if (i % 3 == 0)
                System.out.println(i);
        }

    }
}