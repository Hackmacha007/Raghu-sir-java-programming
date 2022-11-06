//Q33. WAJP to convert all the lowercase letters to uppercase letters.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Sum of digits of string: " + convertToUppercase(st));
    }
}