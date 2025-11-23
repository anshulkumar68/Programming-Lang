package pattern;

public class Pattern3 {
    public static void main(String[] args) {
        pattern11(5);
    }

    public static void pattern11(int n) {
        int value = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }

    // pattern 12
    public static void pattern12(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // pattern 13
    public static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}