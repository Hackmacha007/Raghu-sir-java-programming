package ArrayMethods;
import java.util.Scanner;

public class ArrayMethods {
    private static final Scanner sc = new Scanner(System.in);

    //To read and return the 2D Array or Matrix
    public static int[][] readMatrix() {
        System.out.print("Enter the order of matrix: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        
        System.out.println("Enter the elements of matrix: ");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }


    //To print the 2D Array or Matrix
    public static void printMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }


    //USED IN Q2
    //To find and return the biggest element in matrix
    public static int getBiggestElement(int[][] matrix) {
        int biggest = matrix[0][0];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] > biggest) {
                    biggest = matrix[i][j];
                }
            }
        }

        return biggest;
    }


    //USED IN Q3
    //To add and return the elements of two matrices
    public static int[][] sumTwoMatrices(int[][] mat1, int[][] mat2) {
        int[][] matrix = new int[mat1.length][mat1[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return matrix;
    }


    //USED IN Q4
    //To divide elements of matrix by user entered value
    public static int[][] divideElementsByUserValue(int[][] mat, int divisor) {
        int[][] matrix = new int[mat.length][mat[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = mat[i][j] % divisor;
            }
        }

        return matrix;
    }


    //USED IN Q6
    //To print the count of odd and even elements in matrix
    public static void countOfEvenOdd(int[][] matrix) {
        int evenCount=0, oddCount=0;
        
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] % 2 == 0) {
                    evenCount++;
                }
                else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }


    //USED IN Q8
    //To add and return the elements of matrix
    public static int sumOfMatrixElements(int[][] matrix) {
        int sum=0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }

        return sum;
    }


    
    
    
    
    
    //////////////////////////////////////////////////////////////////////////////////
    ////                            DANGER ZONE                                   ////
    ////            CODE BELOW THIS LINE MAY NOT WORK OR IN PROGRESS              ////
    //////////////////////////////////////////////////////////////////////////////////
    
    //USED IN Q7
    //To add and return the elements of two matrices
    public static int[][] multiplyTwoMatrices(int[][] mat1, int[][] mat2) {
        int[][] matrix = new int[mat1.length][mat1[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = mat1[i][j] * mat2[i][j];
            }
        }

        return matrix;
    }

    
    //USED IN Q9
    private static boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    //USED IN Q9
    //To print the prime numbers present in the matrix
    public static void printPrimeInMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(isPrime(matrix[i][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}