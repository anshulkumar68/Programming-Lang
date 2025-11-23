package string;
public class RemoveVowels 
{
    static String remove(String str)
    {
        return str.replaceAll("[AEIOUaeiou]", "");
    }
    public static void main(String[] args) 
    {
        String s="Radhekrishna";
        // String s1="";
        System.out.println("String after removing vowels: "+remove(s));
    }    
}
