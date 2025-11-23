package string;
// Java Program to Count The Sum of Numbers in a String

public class SumNumberString 
{
    public static void main(String[] args) 
    {
        String str="A4NS6HU2L";
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                count=count+(str.charAt(i)-'0');
        }    
        System.out.println("Sum is :"+count);
    }    
}
