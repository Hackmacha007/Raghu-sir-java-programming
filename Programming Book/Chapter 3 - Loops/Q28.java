import java.util.Scanner;

public class Q28 {
    private static int digitCount(int n) {
        int count=0;
        while(n!=0) {
            n /= 10;
            count++;
        }
        return count;
    }

    private static int pow(int n, int p) {
        int pw=1;
        while(p>0) {
            pw *= n;
            p--;
        }
        return pw;
    }

    private static boolean isAutomorphic(int n) {
        int dc = digitCount(n);
        int numSq=n*n;
        int lastDigits = numSq % pow(10, dc);
        return lastDigits==n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isAutomorphic(n))
            System.out.println(n + " is Automorphic");
        else
            System.out.println(n + " is not Automorphic");
    }
}
