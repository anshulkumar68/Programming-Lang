package recursion;
// package PREPINSTA.RECURSION;

public class Reverse_num
{
    public static void reversenum(int num)
    {
        if(num < 10){
            System.out.print(num);
            return;
        }
        else{
            // print the unit digit of the given number
            System.out.print(num%10);
            //  calling function for remaining number other than unit digit
            reversenum(num/10);
        }
    }   
    public static void main(String[] args) 
    {
        int num = 104;
        System.out.println("Reversed number: ");
        reversenum(num);        // calling recursive function
    }
}
