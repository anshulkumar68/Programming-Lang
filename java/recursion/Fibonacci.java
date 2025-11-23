package recursion;
// import java.util.Scanner;

public class Fibonacci 
{
    static void fib(int a, int b, int n)
    {
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
        fib(b, c, n-1);
    }
 
    public static void main(String args[])
    {
        int n = 9, a=0, b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fib(a, b, n-2);         // n-2 coz already printing 2 digit
        // System.out.println();
    }
}
