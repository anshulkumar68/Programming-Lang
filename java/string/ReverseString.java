package string;
// Java program to reverse a string

public class ReverseString 
{
    public static void main(String[] args) 
    {
        String str = "Today is Wednesday";
        ReverseWords(str);
        ReverseString(str);
    }    
    static void ReverseString(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--)
            rev = rev + str.charAt(i);
        System.out.println("Reverse of String :"+ rev);   
    }

    static void ReverseWords(String str){
        String[] words = str.split(" ");

        String rev = "";
        for(int i = words.length-1; i>=0; i--)
            rev += words[i]+" ";

        System.out.println("Reversed words : "+ rev);
    }
}
