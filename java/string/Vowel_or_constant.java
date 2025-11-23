package string;
// Check whether a character is a vowel or consonant :

public class Vowel_or_constant 
{
    public static void main(String[] args)
    {
        char txt='O';
        if(txt=='A' || txt=='a' || txt=='E' || txt=='e' || txt=='I' ||
         txt=='i' || txt=='O' || txt=='o' || txt=='U' || txt=='u')    
         {
            System.out.println(txt+" is vowel");
         }
         else
            System.out.println(txt+" is constant");
    }
}
