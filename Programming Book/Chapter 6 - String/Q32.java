//Q32. WAJP to calculate the Sum of Digits in string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Sum of digits of string: " + sumOfDigitsOfString(st));
    }
}