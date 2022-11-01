package ArrayMethods;
import java.util.Scanner;

public class ArrayMethods {
    private static Scanner sc = new Scanner(System.in);

    //To print the array
    public static void printArray(int [] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    //To read the array
    public static int [] readArray() {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int [] array = new int[size];
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }


    //To reverse the array
    public static int [] reverseArray(int [] array) {
        int [] reverseArray = new int [array.length];

        for(int i=0; i<array.length; i++) {
            reverseArray[i] = array[array.length-1-i];
        }

        return reverseArray;
    }


    //To get maximum/highest/biggest element of array
    public static int getBiggest(int [] array) {
        int biggestValue = array[0];

        for(int i=0; i<array.length; i++) {
            if(biggestValue < array[i]) {
                biggestValue = array[i];
            }
        }

        return biggestValue;
    }


    //To get minimum/lowest/smallest element of array
    public static int getSmallest(int [] array) {
        int smallestValue = array[0];

        for(int i=0; i<array.length; i++) {
            if(smallestValue > array[i]) {
                smallestValue = array[i];
            }
        }

        return smallestValue;
    }


    //To get the sum of all elements of array
    public static int getSum(int [] array) {
        int sum=0;

        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }


    //To get the average of all elements of array
    public static double getAverage(int[] array) {
        int sum=0;

        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        
        return (double)sum/array.length;
    }


    //To merge two array
    public static int[] mergeArrays(int[] firArray, int[] secArray) {
        int[] mergedArray = new int[firArray.length + secArray.length];
        int j=0;

        for (int i=0; i<firArray.length; i++) {
            mergedArray[j] = firArray[i];
            j++;
        }

        for (int i=0; i<secArray.length; i++) {
            mergedArray[j] = secArray[i];
            j++;
        }

        return mergedArray;
    }


    //To insert a element at specified index in array
    public static int[] insertAtIndex(int [] array, int element, int index) {
        if(index < 0 || index > array.length) {
            System.out.println("Error: Index out of range.");
            return array;
        }

        int [] newArray = new int[array.length+1];
        newArray[index] = element;

        for(int i=0; i<newArray.length-1; i++) {
            if(i<index) {
                newArray[i] = array[i];
            }
            else {
                newArray[i+1] = array[i];
            }
        }

        return newArray;
    }


    //To delete a element at specified index in array
    public static int[] deleteAtIndex(int [] array, int index) {
        if(index < 0 || index >= array.length) {
            System.out.println("Error: Index out of range.");
            return array;
        }

        int [] newArray = new int[array.length-1];

        for(int i=0; i<newArray.length; i++) {
            if(i<index) {
                newArray[i] = array[i];
            }
            else {
                newArray[i] = array[i+1];
            }
        }

        return newArray;
    }
}