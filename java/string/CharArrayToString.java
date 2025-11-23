    package string;
public class CharArrayToString 
{
    public static void main(String[] args) 
    {
        char[] ch={'g','e','t','l','o','s','t'};
        String str= "Likitha";

        System.out.println("String to character array : ");
        strToChar(str);
        System.out.println("Character to String array : ");
        charToStr(ch);
    }    

    static void strToChar(String str){
        char[] ch = str.toCharArray();
        System.out.println(ch);
    }
    static void charToStr(char[] ch){
        String str = new String(ch);
        System.out.println(str);
    }
}
