package array;

public class Sort_0_1_2 {

    // private static void sort(int[] a, int size) {
    // int low = 0, mid = 0, high = size - 1, temp;
    // while (mid <= high) {
    // if (a[mid] == 0) {
    // temp = a[low];
    // a[low] = a[mid];
    // a[mid] = temp;
    // mid++;
    // low++;
    // break;
    // } else if (a[mid] == 1) {
    // mid++;
    // break;
    // } else {
    // temp = a[high];
    // a[high] = a[mid];
    // a[mid] = temp;
    // high--;
    // break;
    // }
    // }
    // }

    // DUTCH FLAG ALGORITHM

    static void sort(int[] a, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
    }

    private static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0 };
        int size = arr.length;
        sort(arr, size);
        System.out.println("Print final array");
        print(arr, size);
        // for (int i = 0; i < size; i++)
        // System.out.print(arr[i] + " ");
    }
}
