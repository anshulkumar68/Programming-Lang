package recursion;
public class Largest
{
    public static void larger(int[] arr, int i, int max)
    {
        if(i==0){
        System.out.println("Largest number is: "+max);
            // return max;
        }
        if(i>0){
            if(arr[i]>max)
            {
                max = arr[i];
            } 
            larger(arr, i-1, max);
        }
    }
    public static void main(String[] args) 
    {
        int[] arr={55, 2308, 103, 980};
        int max = arr[0];
        larger(arr, arr.length-1, max);
        // System.out.println("Largest number is: "+res);
    }
}