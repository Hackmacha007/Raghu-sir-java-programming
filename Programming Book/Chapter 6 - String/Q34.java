//Q34. WAJP to convert all the Uppercase Letters to Lowercase Letters.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Sum of digits of string: " + convertToLowercase(st));
    }
}