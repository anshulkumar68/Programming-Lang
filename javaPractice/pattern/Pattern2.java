package pattern;

public class Pattern2 {
    public static void main(String[] args) {
        pattern7(5);
    }

    // patttern 6
    public static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern 7
    public static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            // for space
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row +1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern 8
    public static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            // for space
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row +1; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    // pattern 9
    public static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            // for space
            for (int space = 1; space <= n- row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            // int value = 
            for(int last=row-1; last>0; last--){
                System.out.print(last+" ");
            }
            System.out.println();
        }
    }

    // pattern 10
    public static void pattern10(int n) {
        int value = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}
