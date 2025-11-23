package patterns;
// package PATTERN;

// * * * * *  
// *       *
// *       *
// * * * * *

// public class Pattern2 
// {
//     public static void main(String[] args) {
//         int row=4; 
//         int col=5;
//         for(int i=1; i<=row; i++){
//             for(int j=1; j<=col; j++){
//                 if(i==1 || i==row || j==1 || j==col)
//                     System.out.print("*"+" ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println(" ");
//         }
//     }
// }



public class Pattern2 
{
    public static void main(String[] args) {
        int row=3, col=4;
        for(int i=0; i<=row; i++)
        {
            for(int j=0; j<=col; j++){
                if(i==0 || i==row || j==0 || j==col)
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}
