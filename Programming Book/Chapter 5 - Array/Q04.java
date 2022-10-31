//Q4. Write a java program to define a method to return biggest element from the array.

import java.util.Scanner;
public class Q04 {
    private static int biggest(int[] arr) {
        int big=arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > big) {
                big = arr[i];
            }
        }
        return big;
    }

    private static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("The biggest element is: "+ biggest(readArray()));
    }
}
