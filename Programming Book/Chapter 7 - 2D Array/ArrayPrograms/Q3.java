//Q3. WAJP to Add the Elements of Two Matrix.

import static ArrayMethods.ArrayMethods.*;
public class Q3 {
    public static void main(String[] args) {
        System.out.println("For first matrix: ");
        int[][] mat1 = readMatrix();

        System.out.println("For second matrix: ");
        int[][] mat2 = readMatrix();

        System.out.println("After the addition of two matrices: ");
        printMatrix(sumTwoMatrices(mat1, mat2));
    }
}
