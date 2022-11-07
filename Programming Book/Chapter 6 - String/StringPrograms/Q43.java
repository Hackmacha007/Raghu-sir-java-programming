/////////////////////////////////////////////////////////////////////////////////////////
////                    DANGER ZONE - CODE BELOW THIS LINE                          /////
////            MAYBE DOESN'T WORK OR NOT NEEDED AT THE MOMENT                      /////
/////////////////////////////////////////////////////////////////////////////////////////

//Q43. WAJP to count how many Characters present in all the Words.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        countCharsPresentInTheWord(st);
    }
}