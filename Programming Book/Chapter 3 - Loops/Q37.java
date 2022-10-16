import java.util.Scanner;

public class Q37 {
    private static int smallest(int a, int b, int c) {
        return a<b&&a<c ? a : b<c?b:c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        System.out.println(smallest(x, y, z));
    }
}
