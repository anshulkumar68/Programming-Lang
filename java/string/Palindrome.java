package string;
// Check if the given string is Palindrome or not

public class Palindrome 
{
    public static void main(String[] args) 
    {
        String str="arora";
        String rev="";
        for(int i=str.length()-1; i>=0; i--)
        rev=rev+str.charAt(i);
        
        if(str.equals(rev))
            System.out.println("String is palindrome");
        else    
            System.out.println("String is not palindrome");
    }    
}
