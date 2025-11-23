package patterns;
//SOLID RHOMBUS
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

public class Pattern5 
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
                System.out.print("* ");
            }
            System.out.println("");
        }            
    }
}    
