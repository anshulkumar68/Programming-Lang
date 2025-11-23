// Write a program to reverse an array or string
package important_questions;

public class O1_Reverse_array {
    // private static void rev(int[] arr, int size) {
        int s = 0, e = size - 1;
        while(s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 9, 20, 13, 21, 4 };
        int size = arr.length;
        rev(arr, size);
    }
}


