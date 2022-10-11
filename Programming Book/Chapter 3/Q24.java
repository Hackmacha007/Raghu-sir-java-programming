import java.util.Scanner;

public class Q24 {
    private static int digitCount(int n) {
        int count = 0;
        do {
            n /= 10;
            count++;
        } while(n != 0);

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

    private static boolean isArmstrong(int num) {
        int sum=0, temp=num;
        int dc=digitCount(num);

        do {
            int r = num%10;
            sum = sum + pow(r, dc);
            num /= 10;
        } while(num!=10);

        return temp == sum;        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if(isArmstrong(n))
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
