//Q6. WAJP to count how many Capital Vowels and Small Vowels present in the String.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Capital Vowels count is: " + countCapitalVowels(st));
        System.out.println("Small Vowels count is: " + countSmallVowels(st));
    }
}
