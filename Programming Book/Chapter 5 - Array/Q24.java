//Q24. Write a java program to define a method to delete the element from the specified index.

import java.util.Scanner;
public class Q24 {
    private static Scanner sc = new Scanner(System.in);
    
    private static int[] deleteInArray(int [] arr, int index) {
        int [] newArr = new int[arr.length-1];
        int j=0;

        for(int i=0; i<newArr.length; i++) {
            if(i!=index) {
                newArr[i] = arr[j];
                j++;
            }
            else {
                newArr[i] = arr[++j];
                j++;
            }
        }
        return newArr;
    }
    
    private static void printArray(int[] arr) {
        System.out.println("after the deletion: ");
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
        int [] arr = readArray();
        System.out.print("Enter the index number: ");
        int ind = sc.nextInt();

        printArray(deleteInArray(arr, ind));
    }
}