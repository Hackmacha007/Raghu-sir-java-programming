import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integer number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        sc.close();

        if(n1==n2 || n1==n3 || n2==n3)
            System.out.println("Please enter distinct values");
        else if(n1>n2 && n1>n3)
            if(n2>n3)
                System.out.println(n2);
            else
                System.out.println(n3);
        else if(n2>n1 && n2>n3)
            if(n1>n3)
                System.out.println(n1);
            else
                System.out.println(n3);
        else if(n3>n1 && n3>n2)
            if(n1>n2)
                System.out.println(n1);
            else
                System.out.println(n2);
        else
            System.out.println("Please enter distinct values");
    }
}