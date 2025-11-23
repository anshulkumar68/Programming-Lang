package string;
// import java.util.Arrays;

public class StringToCharArray
{
    public static void main(String[] args)
    {
        String str="I love jhappi";
        char[] ch=str.toCharArray();

        for(char i: ch)
            System.out.print(i);
        // System.out.println(Arrays.toString(ch));
    }
}
