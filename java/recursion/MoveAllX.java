package recursion;
// Move all 'x' to the end

public class MoveAllX 
{
    public static void Movex(String str, int idx, String newString, int count, char element)
    {
        //base case
        if(idx == str.length()){
            for(int i=0; i<count; i++)
                newString += element;
            System.out.println(newString);
            return;
        }
        //operation
        char currentChar = str.charAt(idx);
        if(currentChar == element){
            count++;
            Movex(str, idx+1, newString, count, element);   //recursive call
        }
        else{
            newString += currentChar;
            Movex(str, idx+1, newString, count, element);   //recursive call
        }

         
    }
    public static void main(String[] args) 
    {
        String str = "acbxcd";
        Movex(str, 0, "", 0, 'c');
    }
}
