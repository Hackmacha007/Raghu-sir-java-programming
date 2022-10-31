//Q2. Write a java program to read n integers and print sum of all those elements.

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int [] arr = new int[n]; 
        int sum=0;
        
        //reading and storing the array
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        //calculating the sum
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        sc.close();
        System.out.println("The sum of all the elements is: " + sum);
    }
}
