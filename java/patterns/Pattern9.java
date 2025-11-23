package patterns;
// 1  
// 2 3  
// 4 5 6  
// 7 8 9 10  
// 11 12 13 14 15  

public class Pattern9 
{
    public static void main(String[] args) {
        int row=5, number=1; 
        // int col=5;
        //outer loop
        for(int i=1; i<=row; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;   // value increment by 1
            }
            System.out.println(" ");
        }
    }  
}
