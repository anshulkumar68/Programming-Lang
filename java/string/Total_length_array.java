package string;
//Program to calculate total length of string entered in string
import java.util.Scanner;

public class Total_length_array 
{
    public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
	    int size=4;
		String arr[] = new String[size];
		int totalLength = 0;
		
		for(int i=0; i<size; i++){
		    arr[i] = sc.next();
		    totalLength+= arr[i].length();
		}
		System.out.println("Total length is: "+totalLength);
	}
}
