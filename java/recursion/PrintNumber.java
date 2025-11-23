package recursion;
// package RECURSION;

public class PrintNumber 
{
    static void printnum(int n)
    {
        //base case
        if(n==0)
            return;
        
        //print
        System.out.print(n+" ");

        //recursive call
        printnum(n-1);      // n-1 for print number is decreasing order
    }
    public static void main(String[] args) 
    {
        int n=5;
        printnum(n);
    }
}
