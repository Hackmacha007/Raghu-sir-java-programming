//Q35. WAJP to to print Frequency of Each Characters in given string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        countFrequencyOfCharacters(st);
    }
}