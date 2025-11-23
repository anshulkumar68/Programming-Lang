package patterns;
//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 

public class Pattern14 {
    public static void main(String[] args) {
        int row = 4;
        // upper half
        for (int i = 1; i <= row; i++) {
            // space
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // lower half
        for (int i = row - 1; i >= 1; i--) {
            // space
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
