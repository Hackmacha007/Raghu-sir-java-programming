//Q1. WAJP to initialize a 2D Array and then Display its all values in the form of a Matrix.

import static ArrayMethods.ArrayMethods.*;
public class Q1 {
    public static void main(String[] args) {
        int[][] matrix = readMatrix();

        System.out.println("The matrix is: ");
        printMatrix(matrix);
    }
}
