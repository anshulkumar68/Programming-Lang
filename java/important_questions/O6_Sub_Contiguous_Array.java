//Function to find the sum of contiguous subarray with maximum sum.
package important_questions;

public class O6_Sub_Contiguous_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        System.out.println(sumArray(arr));  

    }

    private static int sumArray(int[] arr) {
        int maxi=arr[0], sum=0;
        
        for(int i=0; i<arr.length; i++){
        // step 1 finding the sum of subarray with each iteration
        sum+=arr[i];
        // step 2   for every subarray, we will check if the currentMax is the maximum 
        // sum of all contiguous subarrays.
        if(maxi<sum)
            maxi = sum;
        // step 3    if sum of sub-array is less than 0, then initiate sum=0
        if(sum<0)
            sum=0;
        }
        return maxi;
    }
}
