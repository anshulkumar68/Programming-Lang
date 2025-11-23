public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 24, 35, 45, 89, 134, 890, 1234, 2448 };
        int res = search(arr, 89);
        if (res != -1) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int search(int[] arr, int key){
        int s=0, e = arr.length-1;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            // check if target is present
            if(arr[mid] == key)
                return mid;
            // check if target is smaller
            if(arr[mid] > key)
                e = mid-1;
            // check if target is greater
            else    
                s = mid+1;
        }
        return -1;
    }
}
