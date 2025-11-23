package patterns;
// package PATTERN;

// *  
// * *
// * * *
// * * * *

// public class Pattern3
// {
//     public static void main(String[] args) {
//         int row=4; 
//         // int col=5;
//         for(int i=1; i<=row; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }    
// }



public class Pattern3
{
    public static void main(String[] args) {
        int row=4; 
        // int col=5;
        for(int i=0; i<4; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
