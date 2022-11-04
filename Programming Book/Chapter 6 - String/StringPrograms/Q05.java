//Q5. WAJP to count how many Small Vowels present in the String.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(countSmallVowels(st));
    }
}
