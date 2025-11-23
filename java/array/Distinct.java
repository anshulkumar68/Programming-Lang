// Program to count distinct element
package array;

import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        int[] arr = { 12, 10, 9, 10, 2, 11 };
        int size = arr.length;
        countdistinct(arr, size);
        // System.out.println(countdistinct(arr, size));
    }

    // static int countdistinct(int[] arr, int size) {
    // Arrays.sort(arr);
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
    // i++;
    // }
    // count++;
    // }
    // return count;
    // }

    static void countdistinct(int[] arr, int n) {
        boolean visited[] = new boolean[n];
        // loop for traverse through the array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true)
                continue;

            // print and count distinct element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                }
            }
            count++;
            System.out.print(arr[i] + " ");
        }
        System.out.println("Distinct elements are" + " : " + count);
    }
}  