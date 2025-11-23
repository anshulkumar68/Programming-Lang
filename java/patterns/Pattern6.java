package patterns;
//           * 
//        *  *
//     *  *  *
//  *  *  *  *

public class Pattern6
{
    public static void main(String[] args) {
        // outer loop
        int row=4;
        for(int i=0; i<row; i++){
            for(int j=0; j<=row-i; j++){
                System.out.print("  ");
            }
            for(int k=row-i; k<=row; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}



// public class Pattern6
// {
//     public static void main(String[] args) {
//         // outer loop
//         int row=4;
//         for(int i=1; i<=row; i++){
//             //inner loop  -->  Space print
//             for(int j=1; j<=row-i; j++){
//                 System.out.print("  ");
//             }
//             //inner loop  -->  Star print
//             for(int j=1; j<=i; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }    
// }