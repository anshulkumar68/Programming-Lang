package array;

public class MergeTwoArray {

    static void merge(int[] arr1, int[] arr2, int n, int m) {
        int[] arr3 = new int[n + m];
        int i = 0, j = 0, k = 0;
        // compare one-one element from both array and inserting smaller one in 3 array
        while (i<n && j<m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        // for copying remaining element of array 1
        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        // for copying remaining element of array 2
        while (j < m) {
            arr3[k++] = arr2[j++];
        }
        print(arr3);
    }

    static void print(int[] arr3) {
        for (int i: arr3) {
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {
        // int[] arr1 = { 1, 3, 5, 7, 9 };
        // int[] arr2 = { 2, 4, 6, 8 };

        int[] arr1 = { 1, 3, 9, 22, 79, 84 };
        int[] arr2 = { 5, 7, 19, 87 };
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n, m);

    }

}
