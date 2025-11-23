// You need to select the smallest element in the array and move it to the
//  beginning of the array by swapping with the front element
package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 6, 949, 1, 7, 1335, 13 };
        int size = arr.length;
        selectionSort(arr, size);
        printSorted(arr, size);
    }

    private static void selectionSort(int[] arr, int size) {
            // outer loop to iterate through all elements
        for (int i = 0; i < size - 1; i++) {
                // storing minimum value each time for comparing to other values
            int min = i; 
                // assume as first element is smallest so loop runs from i+1
            for (int j = i + 1; j < size; j++) { 
                if (arr[min] > arr[j])
                    min = j;
            }
                // swapping first element with the smallest element in the array
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printSorted(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}