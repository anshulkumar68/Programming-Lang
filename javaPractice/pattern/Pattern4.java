package pattern;

public class Pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        // upper part
        for (int row = 1; row <= n; row++) {
            // space
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            // star after space
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int right = 2; right <= row; right++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part
        // for (int row = 2; row <= n; row++) {
        //     //left space
        //     for (int space = 1; space <= row-1; space++) {
        //         System.out.print("  ");
        //     }
        //     // star after space
        //     for(int col=1; col<=n-row+1; col++){
        //         System.out.print("* ");
        //     }
        //     //star on the right 
        //     for(int right=2; right<=n-row+1; right++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}