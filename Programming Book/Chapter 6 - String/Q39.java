//Q39. WAJP to count how many Words Present in the Sentence.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Count of words present in the string is: " + countWords(st));
    }
}