//Q27. WAJP to convert all the vowels to capital and remaining to small in string.

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