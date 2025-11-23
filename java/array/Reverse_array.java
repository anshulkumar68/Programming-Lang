package array;
public class Reverse_array 
{
    public static void main(String[] args)
    {
        int[] arr={24, 73, 203, 98, 35};
        // int size=arr.length; 
        int start=0, end=arr.length-1;
        while(start<end)
        {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
