//Q21. WAJP to count how many Special Characters and Digits present in the string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Special Characters count is: " + countSpecialCharacters(st));
        System.out.println("Digits count is: " + countDigits(st));
    }
}
