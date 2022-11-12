//Q40. WAJP to String is Anagram or not.

public class Q40 extends StringMethods {
    public static void main(String[] args) {
        System.out.println("Enter the first string: ");
        String st1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String st2 = sc.nextLine();
        
        if(isStringAnagram(st1, st2)) {
            System.out.println("String is anagram");
        }
        else {
            System.out.println("String is not anagram");
        }
    }
}