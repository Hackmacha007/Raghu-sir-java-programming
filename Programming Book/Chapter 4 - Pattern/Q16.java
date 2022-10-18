/*
Print the following pattern
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE  
*/

import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
