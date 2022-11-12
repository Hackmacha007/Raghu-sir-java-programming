//Q38. WAJP to Swipe Every Word First Character with the Same Word Last Character in string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(swipeWordsFirstCharWithLastChar(st));
    }
}