//Q11. WAJP to count how many Small Vowels and Capital Consonants present in the String.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Capital vowels count is: " + countCapitalVowels(st));
        System.out.println("Small Consonants count is: " + countSmallConsonants(st));
    }
}
