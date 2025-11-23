package recursion;
// Program to check prime or not using recursion

public class Prime 
{
    public static boolean prime(int num, int i)
    {
        //base case 
        if(num <= 2)
            return (num==2)?true: false;
        if(num%i==0)
            return false;
        if(i * i > num)
            return true;
            
        //recursive call
        return prime(num, i+1);
            
    }
	public static void main(String[] args) 
	{
	   if(prime(72, 2))
	   System.out.println("Prime number");
	   else 
	   System.out.println("Not a Prime number");
	}    
}
