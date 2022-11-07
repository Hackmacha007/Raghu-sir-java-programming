//Q37. WAJP to check if the string is Palindrome or not.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();

        if(isStringPalindrome(st)) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is Not-Palindrome");
        }
    }
}