package string;
// Prograwm to pick username from gmail

import java.util.Scanner;

public class Name_from_gmail 
{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    StringBuilder sb = new StringBuilder();
	    System.out.print("Enter email: ");
	    String email = sc.nextLine();
		String username = "";
		for(int i=0; i<email.length(); i++){
		    if(email.charAt(i)=='@'){
                break;
		    }
		    else{
		        username += email.charAt(i);
		    }
		}
		System.out.println("Upgraded string is: "+username);
	}
}
