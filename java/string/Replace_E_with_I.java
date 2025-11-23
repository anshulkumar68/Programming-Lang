package string;
// Replace all I with E in string
import java.util.Scanner;

public class Replace_E_with_I 
{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str;
	    StringBuilder sb = new StringBuilder();
	    System.out.println("Enter string: ");
	    str = sc.nextLine();
	}

	static void ReplaceEwithI(String str){
		String result = "";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='e')
				result += 'i';
			else
				result += str.charAt(i);
		}
		System.out.println("Upgraded String is: "+result);
	}
}
