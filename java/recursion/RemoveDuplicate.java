package recursion;
public class RemoveDuplicate 
{
    public static boolean[] map = new boolean[26];

    static void duplicate(String str, int idx, String newString)
    {
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        //operation
        char currentChar = str.charAt(idx);
        if(map[currentChar -'a'] == true){
            duplicate(str, idx+1, newString);   //recursive call
        }
        else{
            newString += currentChar;
            map[currentChar - 'a']=true;       //recursive call
            duplicate(str, idx+1, newString);
        }

    }
    public static void main(String[] args) 
    {
        String str= "abdccbd";
        duplicate(str, 0, "");
    }    
}
