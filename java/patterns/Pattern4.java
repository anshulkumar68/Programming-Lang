package patterns;

// package patterns;
public class Pattern4 {
// package PATTERN;

// * * * *  
// * * *
// * *
// *


// public class Pattern4
// {
//     public static void main(String[] args) {
//         // int row=4; 
//         // int col=5;
//         for(int i=1; i<=4; i++){
//             for(int j=i; j<=4; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }   
// }

    public static void main(String[] args) {
        int row=4;
        for(int i=0; i<row; i++){
            for(int j=row; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}

    