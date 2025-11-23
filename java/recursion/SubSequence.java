package recursion;
// Print all subsequences

public class SubSequence 
{
    static void subsequence(String str, int idx, String newString)
    {
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        // to be
        char currentChar = str.charAt(idx);
        subsequence(str, idx+1, newString+currentChar);     //recursive call
        
        // to be not
        subsequence(str, idx+1, newString);                 //recursive call
    }
    public static void main(String[] args) 
    {
        String str ="abc";
        subsequence(str, 0, "");
    }    
}
