package NotDoneInClass;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int a=0; //first number of series
        int b=1; //second number of series
        int c=0; //temporary variable

        if(n < 1)
        {
            System.out.println("Invalid input");
        }
        else if(n == 1)
        {
            System.out.print(a+ " ");
        }
        else if(n == 2)
        {
            System.out.print(a+ " " + b);
        }
        else
        {   
            System.out.print(a+ " " + b + " ");
            while(true)
            {
                c = a+b;
                if(c > n)
                {
                    break;
                }
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}