//Q16. WAJP to find Unique Elements Common to all Rows in Matrix.

/* 
Logic - How i will do it?
1. Create an array and store the first-row elements inside it.
2. Then get the maximum value from above array, create one array of maxValue+1 size.
3. Then check if the first-row elements are present in the matrix, if yes then increase
    the count in maxValue+1 size array and break after increasing the count.
4. Check if the count of array element is matrix-1 length then print it.
*/

public class Q16 extends ArrayMethods {
    private static void printDistinctElementsCommonToRows(int[][] matrix) {
        int[] firstRow = new int[matrix[0].length];
        int maxValue=0;

        //for storing first row in array and getting maximum value from row one
        for(int i=0; i<firstRow.length; i++) {
            firstRow[i] = matrix[0][i];

            if(maxValue < matrix[0][i]) {
                maxValue = matrix[0][i];
            }
        }

        int[] arr = new int[maxValue+1];
        //Iterating to store the count of elements
        for(int k=0; k<firstRow.length; k++) {
            for(int i=1; i<matrix.length; i++) {
                for(int j=0; j<matrix[i].length; j++) { 
                    if(firstRow[k] == matrix[i][j]) {
                        arr[matrix[i][j]]++;
                        break;
                    }
                }
            }
        }
        
        System.out.print("Distinct Elements common to all rows are: ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==matrix.length-1) {
                System.out.print(i + " ");
            }
        }        
    }

    public static void main(String[] args) {
        printDistinctElementsCommonToRows(readMatrix());
    }
}