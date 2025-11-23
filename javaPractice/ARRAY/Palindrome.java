package javaPractice.ARRAY;

public class Palindrome {
    public static void main(String[] args) {
        int num = 2872;
        isPalindrome(num);
    }

    static void isPalindrome(int num){
        int rev=0, rem, temp= num;
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);
        if(temp==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
