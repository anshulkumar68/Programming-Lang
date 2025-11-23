package recursion;
// Print string in reverse

public class ReverseString 
{
    public static void reverse(String str, int ind)
    {
        //base case
        if(ind == 0){
            System.out.print(str.charAt(ind));
            return;
        }
        //operation
        System.out.print(str.charAt(ind));
        //recursive call
        reverse(str, ind-1);
    }

    public static void main(String[] args) 
    {
        String str= "abcd";
        reverse(str, str.length()-1); 
    }
}
