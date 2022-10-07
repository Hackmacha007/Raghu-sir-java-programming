import java.util.Scanner;

public class DigitProduct {
    private static int productOfDigit(int num){
        int temp=1;
        while(num != 0){
            int ld = num%10;
            temp*=ld;
            num /= 10;           
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(productOfDigit(num));
    }
}
