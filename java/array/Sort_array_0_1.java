package array;

public class Sort_array_0_1 {
    static void sort(int[] arr, int size) {
        int left = 0, right = size - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right)
                left++;
            while (arr[right] == 1 && left < right)
                right--;

            if (arr[left]==1 && arr[right]==0 &&  left < right) {
                arr[left++] = 0;
                arr[right--] = 1;
            }
        }
    }

    private static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1 };
        int size = arr.length;
        sort(arr, size);
        System.out.println("Print final array");
        print(arr, size);
    }
}
