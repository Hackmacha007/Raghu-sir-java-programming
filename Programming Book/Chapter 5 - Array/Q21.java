//Q21. Write a java program to define a method to return reverse the elements present in the array.

import java.util.Scanner;
public class Q21 {
    private static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            rev[i] = arr[arr.length-1-i];
        }
        return rev;
    }

    private static void printArray(int[] arr) {
        System.out.println("after the reverse: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        printArray(reverse(readArray()));
    }
}