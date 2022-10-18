/*
Print the following pattern
    1
   101
  10101
 1010101
101010101
*/

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++) {
                System.out.print(k%2);
            }
            System.out.println();
        }

        // for(int i=1; i<=n*2; i++) {
        //     if(i%2==0) {
        //         continue;
        //     }

        //     for(int k=(n-1)*2; k>=i; k--) {
        //         if(k%2==0) {
        //             continue;
        //         }
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j%2);
        //     }
        //     System.out.println();
        // }
    }
}
