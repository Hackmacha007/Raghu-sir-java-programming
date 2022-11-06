//Q25. WAJP to convert the String to UpperCase.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(convertToUppercase(st));
    }
}