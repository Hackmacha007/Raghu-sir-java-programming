//Q4. WAJP to perform Arithmetic Division Operation on Matrix and store the Remainder(or 0) into new matrix and display it.

import static ArrayMethods.ArrayMethods.*;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = readMatrix();

        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        sc.close();

        System.out.println("After the division of elements by " + divisor);
        printMatrix(divideElementsByUserValue(mat, divisor));
    }
}
