package string;
import java.util.Scanner;

public class Length 
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            // String txt="Anshul kumar ";
            System.out.println("Enter name ");
            String txt = input.nextLine();
            int count=0;
            // char[] ch=txt.toCharArray();
            for(int i=0; i<txt.length(); i++)
                count++;
            System.out.println("Length of \""+txt+"\" is :"+count);
        }
    }
}
