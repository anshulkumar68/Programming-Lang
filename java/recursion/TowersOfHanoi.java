package recursion;
// Tower of Hanoi

public class TowersOfHanoi 
{
    public static void tower(int n, String source, String help, String dest)
    {
        //base call
        if(n==1){
            System.out.println("Transfer "+n+" from "+source+" to "+dest);
            return;
        }
        //recursive call
        tower(n-1, source, dest, help);
        System.out.println("Transfer "+n+" from "+source+" to "+dest);
        tower(n-1, help, source, dest);
    }    
    public static void main(String[] args) 
    {
        int n=3;
        tower(n, "S", "H", "D");    
    }
}
