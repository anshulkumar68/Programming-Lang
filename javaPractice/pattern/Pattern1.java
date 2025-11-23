package pattern;

public class Pattern1 {
    public static void main(String[] args) {
        // int num;
        pattern(5);
    }

    public static void pattern(int num) {
        for(int row = 1; row<=num; row++){
            for(int col= 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern 2
    public static void pattern2(int num) {
        int count = 1;
        for(int row = 1; row<=num; row++){
            for(int col= 1; col<=row; col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    //pattern 3
    public static void pattern3(int n){
        for(int row=1; row<=n; row++){
            int value = row;
            for(int col=1; col<=row; col++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }

    //pattern 4
    public static void pattern4(int n){
        for(int row=1; row<=n; row++){
            int value = row;
            for(int col=1; col<=row; col++){
                System.out.print(value+" ");
                value--;
            }
            System.out.println();
        }
    }

    //pattern 5
    public static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            // for space
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
