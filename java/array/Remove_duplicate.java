// Program to remove duplicate from the array
package array;
import java.util.Arrays;

public class Remove_duplicate {
    static int duplicate(int[] arr, int size) {
        Arrays.sort(arr);
        if (size == 0 || size == 1) // Return if array is empty or single
            return size;

        // int[] temp=new int[size];
        int j = 0; // Start traversing elements
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) { // If current element is not equal to next element then store that current
                                        // element
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[size - 1]; // Store the last element as whether it is unique or repeated, it hasn't stored
                                  // previously

        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 34, 4, 54, 54, 509, 4, 92 };
        int size = arr.length;
        size = duplicate(arr, size);

        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
