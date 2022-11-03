//Q34. Write a java program to remove duplicate elements present in the array.

//////////////////////////////////////////////////////////////////////////////////
//            DANGER ZONE - CODE BELOW THIS LINE MAY NOT WORK                   //
//////////////////////////////////////////////////////////////////////////////////

import static ArrayMethods.ArrayMethods.*;
public class Q34 {
    public static void main(String[] args) {
        int[] array = readArray();
        printArray(removeDuplicates(array));
    }
}