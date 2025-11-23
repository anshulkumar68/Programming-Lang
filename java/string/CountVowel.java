package string;
public class CountVowel 
{
    public static void main(String[] args) 
    {
        int count =0;
        String s="Ismaiel";
        // char[] txt=s.toCharArray();
        for(int i=0; i< s.length(); i++)
        if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' ||
        s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u')    
        {
            count++;
        }  
        System.out.println("Number of vowels : "+count);   
    }
}
