/*
Print the following pattern n=3
1 2 3 2 1
1 2   2 1
1       1                      */

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            //for space
            for(int j=1; j<=i-1; j++) {
                
            }
            //for printing


            System.out.println();
        }
    }

    