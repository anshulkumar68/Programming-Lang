package array;
public class Palindrome {
    static void palin(int num) {
        int rem, rev = 0;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev)
            System.out.println("Palindrome of given " + temp + " number is: " + rev);
        else
            System.out.println("Not a palindrome number");
    }

    public static void main(String[] args) {
        int num = 27072;
        palin(num);
    }
}
