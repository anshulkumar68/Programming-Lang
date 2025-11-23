package sorting;
// Merge Sort is a sorting algorithm that uses the divide-and-conquer approach to sort a given array. 
// The algorithm divides the given array into two halves, sorts each half recursively using Merge Sort,
// and then merges the sorted halves back into a single sorted array.

public class MergeSort 
{
    public static void conquer(int[] arr, int si, int mid, int ei)
    {
        int[] merged = new int[ei-si+1];
        int ind1 = si;           // left array indexing
        int ind2 = mid+1;       //right array indexing
        int x = 0;              // merge array indexing
    
        // for copying 
        while(ind1 <= mid && ind2 <=ei)
        {
            if(arr[ind1]<arr[ind2]){
                merged[x++]=arr[ind1++];
            }
            else{
                merged[x++]= arr[ind2++];
            }
        }
        //  for copying first array as it is as they are already sorted
        while(ind1<=mid){
            merged[x++]=arr[ind1++];
        }
        //  for copying second array as it is as they are already sorted
        while(ind2<=ei){
            merged[x++]=arr[ind2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j]=merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei)
    {
        // int ei;
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;
        // left par
        divide(arr, si, mid);
        //right part
        divide(arr, mid+1, ei);
        // for merging the array
        conquer(arr, si, mid, ei);

    }
    public static void main(String[] args) 
    {
        int[] arr = {4, 70, 9, 209, 5};
        int size = arr.length;
        divide(arr, 0, size-1);

        for(int i=0; i<size; i++)//  for copying first array as it is as they are already sorted
            System.out.print(arr[i]+" ");
    }    
}
