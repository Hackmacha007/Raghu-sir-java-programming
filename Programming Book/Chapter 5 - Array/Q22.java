//Q22. Write a java program to define a method to combine two array elements into single array.

import java.util.Scanner;
public class Q22 {
    private static Scanner sc = new Scanner(System.in);
    
    private static int[] combineArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i=0;

        for (int j=0; j<a.length; j++) {
            c[i] = a[j];
            i++;
        }
        for (int j=0; j<b.length; j++) {
            c[i] = b[j];
            i++;
        }
        return c;
    }

    private static void printArray(int[] arr) {
        System.out.println("after combining both arrays: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] readArray() {
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }

    public static void main(String[] args) {
        printArray(combineArray(readArray(), readArray()));
    }
}