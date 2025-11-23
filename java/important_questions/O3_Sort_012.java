// Sort an array of 0s, 1s and 2s
package important_questions;

public class O3_Sort_012 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 0, 0, 2, 1, 0 };
        sort(arr);
    }
    // DUTCH FLAG ALGORITHM WHICH introduced from Dutch flag
    private static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        // Iterate till all the elements are sorted
        while (mid <= high) {
            // If the element is 0
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
                // If the element is 1 .
            } else if (arr[mid] == 1) {
                mid++;
                // If the element is 2 .
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
