package javaPractice.ARRAY;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 2, 1, 1, 0 };
        sort012(arr);
    }

    static void sort012(int[] arr){
        int low = 0, mid = 0, high=arr.length-1, temp;

        while(mid<=high){
            if(arr[mid]==0){
                temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else{
                temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
                // mid++;
            }
        }
        for(int ele : arr)
            System.out.print(ele+" ");
    }
}

