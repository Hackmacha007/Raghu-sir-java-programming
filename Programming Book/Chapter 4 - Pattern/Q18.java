/*
Print the following pattern -> Same as question 17
10101
10101
10101
10101
10101  
*/

import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}