package patterns;
// Hollow solid rhombus


public class Pattern16 
{
    public static void main(String[] args) {
        int row=5;
        //
        for(int i=1; i<=row; i++){
            //spaces
            for(int j=1; j<=row-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=row; j++){
                if(i==1 || i==row || j==1 || j==row)
                    System.out.print("* ");
                else    
                    System.out.print("  ");
            }
            System.out.println("");
        }            
    }
}


// public class Pattern12 
// {
//     public static void main(String[] args) {
//         int row=5;
//         //
//         for(int i=1; i<=row; i++){
//             //spaces
//             for(int j=1; j<=row-i; j++){
//                 System.out.print("  ");
//             }
//             //stars
//             for(int j=1; j<=row; j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }            
//     }
// }    
