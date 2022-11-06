//Q2. WAJP to count how many Capital letters and Small letters present in the String.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();

        System.out.println("Capital Letters count is: "+ countCapitalLetters(st));
        System.out.println("Small Letters count is: "+countSmallLetters(st));
    }
}
