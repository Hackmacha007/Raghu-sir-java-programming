//Q23. WAJP to count how many Small Letters, Special Characters and Digits present in the string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Small Letters count is: " + countSmallLetters(st));
        System.out.println("Special Characters count is: " + countSpecialCharacters(st));
        System.out.println("Digits count is: " + countDigits(st));
    }
}
