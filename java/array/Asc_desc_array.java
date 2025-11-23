// Sorting first half in Ascending order and second half in Descending order
package array;

public class Asc_desc_array {
    static void print(int[] a, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) // for whole array
        {
            for (int j = 0; j < n / 2; j++) // for first half
            {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int j = n / 2; j < n - 1; j++) // for second half
            {
                if (a[j + 1] > a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 1, 10, 30, 40, 20 };
        int s = arr.length;
        print(arr, s);
    }
}