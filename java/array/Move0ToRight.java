package array;

public class Move0ToRight {
    static void move(int[] arr, int size) {
        int j = 0;
        for(int i=0; i<size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    static void print(int[] arr, int size) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 16, 3, 0, 0, 23, 28 };
        int size = arr.length;
        move(arr, size);
        print(arr, size);
    }
}
