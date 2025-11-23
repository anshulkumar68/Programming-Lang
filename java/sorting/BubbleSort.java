// A bubble sort algorithm goes through a list of data a number of times,
// comparing two items that are side by side to see which is out of order
package sorting;
public class BubbleSort {
    private static void bubbleSort(int[] arr, int size) {
        // outer loop for accessing all element
        for (int i = 0; i < size - 1; i++) {
            // inner loop for comparing adjacent values
            for (int j = 0; j < size - i - 1; j++) {
                // size - i - 1 (to skip sorted right element in every traverse)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void printSorted(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 120, 6, 9, 121, 78, 1313, 3 };
        int size = arr.length;
        bubbleSort(arr, size);
        printSorted(arr, size);
    }
}