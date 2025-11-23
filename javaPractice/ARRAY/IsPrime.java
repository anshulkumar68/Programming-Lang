package javaPractice.ARRAY;

public class IsPrime {
    public static void main(String[] args) {
        int num = 26;
        boolean res= prime(num);
        if(res)
            System.out.println(" not a prime number");
        else
            System.out.println("prime number");
    }

    static boolean prime(int num){
        for(int i=2; i<num; i++){
            if(num % 2==0)
                return true;
        }
        return false;
    }
}
