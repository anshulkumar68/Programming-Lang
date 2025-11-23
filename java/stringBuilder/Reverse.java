package stringBuilder;
public class Reverse 
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        int start =0;
        int end=sb.length()-1;

        while(start<end)
        {
            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(start, endChar);
            sb.setCharAt(end, startChar);
        }
        System.out.println(sb);
    }    
}
