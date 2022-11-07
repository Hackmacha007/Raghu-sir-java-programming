//Q27. WAJP to convert all the Vowels to Capital and Remaining to Small in string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(convertVowelsToCapitalRemainingSmall(st));
    }
}