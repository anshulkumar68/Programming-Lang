package important_questions;

public class O5_Rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 4, 68, 22, 14, 180, 200 };
        int key = 2;
        rotate(arr, key);
    }

    private static void rotate(int[] arr, int key) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + key) % arr.length] = arr[i];
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(temp[i] + " ");
    }
}
