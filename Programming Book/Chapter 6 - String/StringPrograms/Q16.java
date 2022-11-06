//Q16. WAJP to count how many Capital Vowels, Small Consonants and Special Characters present in the string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Capital Vowels count is: " + countCapitalVowels(st));
        System.out.println("Small Consonant count is: " + countSmallConsonants(st));
        System.out.println("Special character count is: " + countSpecialCharacters(st));
    }
}
