package sorting;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] arr = {23, 171, 87, 19, 129, 786, 26, 468};
        sort(arr);
    }
    
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr)
            System.out.print(i + " ");
    }

}
