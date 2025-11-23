// Move all negative numbers to beginning and positive to end with constant extra space
package important_questions;

public class O4_NegativeOnTheLeft {
        static void arrange(int[] arr, int size) {
        int j = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0){
                j++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }
        }
    }

    private static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int size = arr.length;
        arrange(arr, size);
        print(arr, size);
    }
} 
                
                
                