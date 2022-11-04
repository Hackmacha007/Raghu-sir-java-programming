//Q3. WAJP to count how many Small letters present in the String.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(countSmallLetters(st));
    }
}
