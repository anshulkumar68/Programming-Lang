package recursion;
// Find first & last occurrence of element

public class FirstLastOccurence 
{
    public static int first =-1;
    public static int last =-1;
    
    public static void firstlast(String str, int ind, char element)
    {
        //base case
        if(ind == str.length()){
            System.out.println("First index: "+first);
            System.out.println("Last Index: "+last);
            return;
        }

        //operation
        char currentChar = str.charAt(ind);
        if(currentChar == element){
            if(first == -1){
                first = ind;
            }
            else{
                last = ind;
            }

        }

        //recursive call
        firstlast(str, ind+1, element);
        
    }
    public static void main(String[] args) 
    {
        String str = "anshula";
        int ind=0;
        firstlast(str, ind, 's');
    }    
}
