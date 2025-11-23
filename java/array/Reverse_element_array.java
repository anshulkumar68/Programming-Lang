// Java program for reverse all element in array
package array;
public class Reverse_element_array
{
    static int reverse(int num)
    {
        int rem, rev=0;
        while(num>0)
        {
                rem=num%10;
                rev=rev*10 + rem;
                num=num/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        int arr[]={1231, 12321, 878, 345543};
        int arr1[]=new int[10];     // initializing a new array for storing reverse value
        for(int i=0; i<arr.length; i++)
        {
            int num=arr[i];
            int res=reverse(num);       // calling reverse method for reversing each element of array
            arr1[i]=res;
        }

        System.out.println("Original array is: ");
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println("Reverse array is: ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr1[i]+" ");        // printing reversed array
    }
}
