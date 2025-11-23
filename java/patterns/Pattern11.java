package patterns;
// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

public class Pattern11 
{
    public static void main(String[] args){
        int row=5;
        // outer loop
        for(int i=1; i<=row; i++){
            //space
            // for(int j=1; j<=row-i; j++){
            //     System.out.print(" ");
            // }
            //star
            for(int j=1; j<=i; j++){
                System.out.print(i+" "); 
            }
            System.out.println("");
        }
    }        
}


