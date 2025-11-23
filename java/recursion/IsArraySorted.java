package recursion;
// Check if the array is sorted (strictly increasing)
public class IsArraySorted 
{
    public static boolean sorted(int[] arr, int idx)
    {
        //base case
        if(idx==arr.length-1){
            return true;
        }
        //operation
        if(arr[idx]<arr[idx+1]){
            //array is sorted till now
            return sorted(arr, idx+1);     //recursive call
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) 
    {
        int[] arr = {4, 7, 9, 12};
        boolean res = sorted(arr, 0 );
        if(res==true)   
        System.out.println("Array is sorted");
        else
        System.out.println("Array is not sorted");
    }    
}
