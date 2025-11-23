package javaPractice.ARRAY;

public class Fibonacci {
    public static void main(String[] args){
        int n = 7;
        fibi(n);
    }

    static void fibi(int n){
        int a = 0, b = 1, c=1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            a = b;
            b=c;
            c= a+b;
        }
    }
}
