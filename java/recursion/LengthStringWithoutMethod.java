package recursion;
public class LengthStringWithoutMethod 
{
    public static int length(String str , int i)
    {
        int len=0;
        //base case
        if(i==str.length())
            return 0;

        len++;
        return 1+length(str, i+1);

    }
    
	public static void main(String[] args) 
	{
	    String str = "GetLostSpace";
		int res = length(str,0);
		System.out.println("sum is : "+ res);
	}    
}
