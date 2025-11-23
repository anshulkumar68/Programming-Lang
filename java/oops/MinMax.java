package oops;
// USING PUBLIC METHOD

/*
public class MinMax
{
    int max=Integer.MIN_VALUE;
    public int mini(int[] arr)
    {
        int min=Integer. MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
                min=arr[i];       
        }
        return min;
    }
    public int maxi(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];       
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] arr={30, 10, 760, 22, 249};
        MinMax mn = new MinMax();
        System.out.println("Minimum number is: "+mn.mini(arr));
        System.out.println("Maximum number is: "+mn.maxi(arr));
    }
}
 */

// USING STATIC METHOD 

public class MinMax
{
    static int mini(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
                min=arr[i];       
        }
        return min;
    }
    static int maxi(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];       
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] arr={30, 16, 603, 22, 249};
        System.out.println("Minimum number is: "+mini(arr));
        System.out.println("Maximum number is: "+maxi(arr));
    }
}


