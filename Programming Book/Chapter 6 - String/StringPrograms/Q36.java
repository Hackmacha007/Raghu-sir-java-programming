//Q36. WAJP to convert all the uppercase letters to lowercase letters.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Reversed string: " + reverseString(st));
    }
}