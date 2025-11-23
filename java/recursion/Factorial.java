package recursion;
import java.util.Scanner;

public class Factorial 
{
    static int fact(int n)
    {
        //base case
        if(n==0 || n==1)
            return 1;
        //recursive call 
        return n * fact(n-1);
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int res = fact(n);
            System.out.println("Sum is: "+res);
        }
    }
}
