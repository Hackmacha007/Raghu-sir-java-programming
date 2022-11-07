//Q41. WAJP to Reverse the Words in the Sentence.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(reverseTheWordsOfString(st));
    }
}