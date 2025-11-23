package patterns;
// 1  1  1  1  
//   2  2  2
//    3  3
//      4

public class Pattern17
{
    public static void main(String[] args) {
    int row=4;
    for(int i=1; i<=row; i++){
        //space
        for(int j=1; j<=i-1; j++){
            System.out.print(" ");
        }
        //star
        for(int j=row; j>=i; j--){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    }    
}
