//Q12. WAJP to count how many Letters and Special Characters present in the string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Letters count is: " + countLetters(st));
        System.out.println("Special Characters count is: " + countSpecialCharacters(st));
    }
}
