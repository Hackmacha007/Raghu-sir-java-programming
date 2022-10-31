//Q16. Write a java program to define a method to return how many even numbers present in array within 1000.

import java.util.Scanner;
public class Q16 {
    private static boolean isEven(int n) {
        if(n>1000) {
            return false;
        }
        else {
            if(n%2==0) {
                return true;
            }
            return false;
        }
    }

    private static int evenCount(int[] arr) {
       int count=0;
       for(int i=0; i<arr.length; i++) {
            if(isEven(arr[i])) {
                count++;
            }
        }
        return count;
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
        System.out.println("The count of even numbers within 1000 is: "+ evenCount(readArray()));
    }
}
