package sorting;
// Sort the elements of an array

// package SORTING;        // comment this line

public class Sort_array {
    static void sortarray(int[] arr, int size) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Ascending order ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        System.out.println("Array in sorted descending order ");
        for (int i = size - 1; i > 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 1, 10, 30, 40, 20, 10 };
        int size = arr.length;
        sortarray(arr, size);
    }
}
