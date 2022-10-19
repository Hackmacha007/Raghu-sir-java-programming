/*
Print the following pattern
    a
   abc
  abcde
 abcdefg
abcdefghi
*/

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        //for lines
        for(int i=1; i<=n; i++) {
            //for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //for numbers
            for(int k=1; k<=i*2-1; k++) {
                System.out.print((char)(k+96));
            }
            System.out.println();
        }
    }
}
