package recursion;
public class SumOfN 
{
    static int printsum(int n)
    {
        // base case
        // if(n==0)
        //     return n + printsum(n-1);
        // else
        //     return n;

        //base case
        if(n==0)
            return 0;
        //recursive call
        return n+printsum(n-1);
    }
    public static void main(String[] args) 
    {
        int n = 7;
        int res = printsum(n);
        System.out.println("Sum is: "+res);
    }
}
 