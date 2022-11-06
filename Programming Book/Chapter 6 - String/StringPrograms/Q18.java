//Q18. WAJP to count how many Capital Vowels, Capital Consonants and Special Characters present in the string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Capital Vowels count is: " + countCapitalVowels(st));
        System.out.println("Capital Consonants count is: " + countCapitalConsonants(st));
        System.out.println("Special Characters count is: " + countSpecialCharacters(st));
    }
}
