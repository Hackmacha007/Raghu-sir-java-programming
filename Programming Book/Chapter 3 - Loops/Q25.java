import java.util.Scanner;

public class Q25 {
    private static void sanjuGeeta(int n) {
        if(n%3==0 && n%5==0)
            System.out.println("sanju weds geeta");
        else if(n%3 == 0)
            System.out.println("sanju");
        else if(n%5 == 0)
            System.out.println("geeta");
        else
            System.out.println("breakup");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        sanjuGeeta(n);
    }
}
