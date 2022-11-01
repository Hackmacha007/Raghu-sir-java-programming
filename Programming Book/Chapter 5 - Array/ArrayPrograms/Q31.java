//Q31. Write a java program to search the element from the array if present return index else return -1.

import static ArrayMethods.ArrayMethods.*;
import java.util.Scanner;
public class Q31 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = readArray();

        System.out.println("Enter the element which you want to search: ");
        int element = sc.nextInt();

        System.out.println(searchInArray(array, element));
    }
}