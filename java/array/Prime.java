package array;
public class Prime {
    static boolean prime(int num) {
        // boolean isPrime;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
            // break;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 55;
        boolean res = prime(num);
        if (res == false)
            System.out.println("Not a prime");
        else
            System.out.println("Prime number");
    }
}
