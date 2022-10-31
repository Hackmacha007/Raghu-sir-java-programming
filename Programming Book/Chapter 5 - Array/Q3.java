//Q3. Write a java program to define a method to return smallest element from the array.

import java.util.Scanner;
public class Q3 {
    private static int smallest(int[] arr) {
        int small=arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
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
        System.out.println("The smallest element is: "+ smallest(readArray()));
    }
}
