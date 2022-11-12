//Q30. WAJP to convert Every Words Last Character into Small and Remaining to Capital in string.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println(convertEveryWordsLastCharacterToSmall(st));
    }
}