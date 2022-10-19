package NotDone;

import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        //for lines
        for(int i=1; i<=n; i++) {
            //for numbers
            for(int k=1; k<=n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}