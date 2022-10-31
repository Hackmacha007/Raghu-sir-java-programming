//Q5. Write a java program to define a method to return average of integer array.

import java.util.Scanner;
public class Q5 {
    private static double average(int[] arr) {
        int sum=0;

        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        return (double)sum/arr.length;
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
        System.out.println("The average of all the element is: "+ average(readArray()));
    }
}
