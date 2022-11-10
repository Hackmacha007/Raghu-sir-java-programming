//Q7. WAJP to Multiply Two Matrices.

public class Q07 extends ArrayMethods{ 
    private static int[][] multiplyTwoMatrices(int[][] mat1, int[][] mat2) {
        int[][] matrix = new int[mat1.length][mat1[0].length];
        //Need to write the logic
        
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println("For first matrix: ");
        int[][] mat1 = readMatrix();
        System.out.println("For second matrix: ");
        int[][] mat2 = readMatrix();
        
        System.out.println("Multiplication of two matrices: ");
        printMatrix(multiplyTwoMatrices(mat1, mat2));
    }
}
