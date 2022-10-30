//Q6. Write a java program to define a method to return how many prime numbers present in array.

import java.util.Scanner;
public class Q6 {
    private static boolean isPrime(int n) {
        for(int i=2; i<n/2; i++) 
            if(n%i==0) 
                return false;
        return true;
    }

    private static int primeCount(int[] arr) {
       int count=0;
       for(int i=0; i<arr.length; i++) {
            if(isPrime(arr[i])) {
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

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        return arr;
    }

    public static void main(String[] args) {
        System.out.println("The count of prime numbers are: "+ primeCount(readArray()));
    }
}
