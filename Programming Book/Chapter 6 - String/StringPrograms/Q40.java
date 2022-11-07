//Q40. WAJP to String is Anagram or not.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String st1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String st2 = sc.nextLine();
        sc.close();
        
        if(isStringAnagram(st1, st2)) {
            System.out.println("String is anagram");
        }
        else {
            System.out.println("String is not anagram");
        }
    }
}