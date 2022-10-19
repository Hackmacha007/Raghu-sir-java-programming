/*
Print the following pattern
    1
   21
  321
 4321
54321
*/

import java.util.Scanner;
public class Q4 {
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
            for(int k=i; k>=1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}