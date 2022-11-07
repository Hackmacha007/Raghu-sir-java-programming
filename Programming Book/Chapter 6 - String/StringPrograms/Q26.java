//Q26. WAJP to convert all the Vowels to Small and Remaining to Capital in string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(convertVowelsToSmallRemainingCapital(st));
    }
}