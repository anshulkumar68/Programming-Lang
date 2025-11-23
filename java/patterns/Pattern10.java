package patterns;
// 1  
// 0 1  
// 1 0 1  
// 0 1 0 1  
// 1 0 1 0 1  

public class Pattern10 
{
    public static void main(String[] args) {
        int row=5;
        //outer loop
        for(int i=1; i<=row; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println(" ");
        }
    }      
} 