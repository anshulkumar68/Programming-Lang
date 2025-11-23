package array;
// Java program to determine the array is a subset of another array

public class Array_subset 
{
    static boolean isSubset(int[] arr1, int[] arr2, int size1, int size2)
    {
        int i=0;
        int j=0;
        for( i=0; i<size2 ; i++)
        {
            for(j=0; j<size1; j++)
            {
                if(arr2[i]==arr1[j])
                    break;
            }
            if(j==size1)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        int arr2[] = { 11, 30, 70, 10};
    
        int size1 = arr1.length;
        int size2 = arr2.length;

        if(isSubset(arr1, arr2, size1, size2))
            System.out.println("arr2 is subset of arr1");
        else
            System.out.println("arr2 is not subset of arr1");
    }   
}
