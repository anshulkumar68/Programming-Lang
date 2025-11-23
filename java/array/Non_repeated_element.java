package array;
import java.util.Arrays;

public class Non_repeated_element 
{
    static void nonrepeat(int[] arr, int size)
    {
        
        Arrays.sort(arr);
        for(int i=0; i<size; i++)
        {
            int count=1;
            while(i<size-1 && arr[i]==arr[i+1])
            {
                i++;
                count++;
            }
            if(count==1)
                System.out.println(arr[i]+" ");
        }
    }
	public static void main(String[] args) 
	{
		int[] arr={4, 5, 2, 8, 1, 5, 4};
		int size=arr.length;
		nonrepeat(arr, size);
	}
}