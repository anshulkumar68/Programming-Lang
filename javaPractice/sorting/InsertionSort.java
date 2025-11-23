package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 23, 171, 87, 19, 129, 786, 26, 468 };
        sort(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; // assuming first element as a sorted array
            int j = i - 1;
            //
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; // shift element
                j--;
            }
            arr[j + 1] = temp; // +1 becasue we need to insert element in next location
        }
        for (int i : arr)
            System.out.print(i + " ");
    }
}
