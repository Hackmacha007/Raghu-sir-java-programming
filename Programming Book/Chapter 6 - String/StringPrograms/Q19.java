//Q19. WAJP to count how many Small Vowels, Small Consonants and Special Characters present in the string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Small Vowels count is: " + countSmallVowels(st));
        System.out.println("Small Consonant count is: " + countSmallConsonants(st));
        System.out.println("Special character count is: " + countSpecialCharacters(st));
    }
}
