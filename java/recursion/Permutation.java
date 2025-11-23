package recursion;
public class Permutation 
{
    public static void permutation(String str, String subpart)
    {   
        //base case 
        if(str.length()==0){
            System.out.println(subpart);
            return;
        }
        
        //processing and recursive relation
        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            //  abc -->   "ab"
            String newString = str.substring(0,i) + str.substring(i+1);
            permutation(newString, subpart+currentChar);
        }
    }
    
	public static void main(String[] args) 
	{
        String str = "ABC";
        permutation(str, "");
	}
}
