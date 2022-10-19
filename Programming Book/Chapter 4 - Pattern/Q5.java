/*
Print the following pattern
    1
   000
  11111
 0000000
111111111
*/

import java.util.Scanner; 
public class Q5 {
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
            for(int j=1; j<=2*i-1; j++) {
                System.out.print(i%2);
            }
            System.out.println();
        }
    }
}
