package search;
public class BinarySearch {
    static int bsearch(int[] arr, int key) {
        int size = arr.length, start = 0, end = size - 1;
                
        while(start<=end){
            int mid = start +(end-start)/2;

            if(key==arr[mid])
                return mid;
            if(key<arr[mid])
                end= mid-1;
            else    
                start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 24, 34, 49, 56, 60, 75, 79 };
        int index = bsearch(arr, 60);

        if (index == -1)
            System.out.println("Not found!");
        else
            System.out.println("ELement found at: " + index);
    }
}
