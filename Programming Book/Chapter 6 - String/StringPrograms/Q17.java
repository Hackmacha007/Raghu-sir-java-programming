//Q17. WAJP to count how many Small Vowels, Capital Consonants and Special Characters present in the string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Small Vowels count is: " + countSmallVowels(st));
        System.out.println("Capital Consonant count is: " + countCapitalConsonants(st));
        System.out.println("Special character count is: " + countSpecialCharacters(st));
    }
}
