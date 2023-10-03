import java.util.Scanner;

public class StringCount11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Word with 'a' on it ");
         String word=scanner.next();
         int i =0;

     for(int j=0; j<word.length(); j++)    /////loop

     {
         if ((word.charAt(j)=='a') || (word.charAt(j)=='A'))
             i++;
     }
        System.out.println(i);

    }
}