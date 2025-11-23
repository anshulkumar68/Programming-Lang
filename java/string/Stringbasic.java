package string;
public class Stringbasic 
{
    public static void main(String[] args) 
    {
        String txt="Please locate where 'locate' occurs!";
        System.out.println("Length of given string is: "+txt.length());    // length of given string

        System.out.println("change to uppercase: "+txt.toUpperCase());     //  convert whole string to uppercase

        System.out.println("Change to lowercase: "+ txt.toLowerCase());    // convert whole string to lowercase

        System.out.println("Locate the given string: "+ txt.indexOf("where"));   //  returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
    }
}
