package recursion;
public class PowerOfN 
{
    static int calcPower(int x, int n)
    {
        if(n==0)
            return 1;       // base case 1
        if(x==0)
            return 0;       // base case 2
        //  recursive call
        // int xPownm1 = calcPower(x, n-1);
        // int xPown = x * xPownm1;
        // return xPown;
        return x* calcPower(x, n-1);            // another way of writing it
    }
    public static void main(String[] args) 
    {
            int x = 2;
            int n = 6;
            System.out.println("Power of given number is : "+calcPower(x, n));
    }    
}
