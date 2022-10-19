/*
Print the following pattern
    1
   010
  10101
 0101010
101010101
*/

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        //for lines
        int x=1;
        for(int i=1; i<=n; i++) {
            //for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //for numbers
            for(int k=1; k<=i*2-1; k++) {
                System.out.print(x%2);
                x++;
            }
            System.out.println();
        }
    }
}
