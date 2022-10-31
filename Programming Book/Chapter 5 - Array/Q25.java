/*Q25. Write a java program to insert one element in another element in the specified index.
Explanation: Create a new array and insert 1st array elements upto specified index(2)
after that insert 2nd array elements in the specified index remaining 1st array elements
you have to insert.*/

import java.util.Scanner;
public class Q25 {
    private static Scanner sc = new Scanner(System.in);
    
    private static int[] insertInArray(int [] a, int [] b, int index) {
        int [] newArr = new int[a.length+b.length];
        int j=0; int k=0;

        for(int i=0; i<newArr.length; i++) {
            if(i!=index) {
                newArr[i] = a[k];
            }
            else {
                int blen=b.length;
                while(blen>0) {
                    newArr[i] = b[j];
                    blen--;
                    i++;
                    j++;
                }
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
        System.out.println("For the first array: ");
        int [] a = readArray();
        System.out.println("For the second array: ");
        int [] b = readArray();
        //index after which we have to insert 2nd array elements and then remaining
        //1st array elements
        System.out.print("Enter the index number: ");
        int ind = sc.nextInt();

        printArray(insertInArray(a, b, ind));
    }
}