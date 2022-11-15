//Q21. WAJP to Traverse the Matrix in Zig-Zag Pattern.

public class Q21 extends ArrayMethods {
    private static void traverseInZigZag(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=0; i<n+m-1; i++) {
            int x=0, y=0;
            if (i%2 == 1) {
                // down left
                if(i<n) {
                    x = 0;
                    y = i;
                }
                else {
                    x = i-n+1;
                    y = n-1;
                }
                while (x<m && y>=0) {
                    System.out.print(matrix[x++][y--] + " ");
                }
            } 
            else {
                // up right
                if(i<m) {
                    x = i;
                    y = 0;
                }
                else {
                    x = m-1;
                    y = i-m+1;
                }
                while (x>=0 && y<n) {
                    System.out.print(matrix[x--][y++] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        traverseInZigZag(readMatrix());
    }
}