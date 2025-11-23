// Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands
// Values from the unsorted part are picked and placed at the correct position in the sorted part.

package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 73, 234, 8, 38, 1, 23 };
        int size = arr.length;
        insertionSort(arr, size);
        printSorted(arr, size);
    }

    private static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            // store the current value at current in key
            int current = arr[i];
            // pointer to index just before the key's index
            int j = i - 1;
            // move values in arr[0...i-1] greater than key one position to their right for
            // placing the element at correct position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            // after every iterate of j will be at preceeding locztion of copying element so
            // (j+1)
            arr[j + 1] = current;
        }
    }

    private static void printSorted(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

}
