// Program to find repeating element in java
package array;

// import java.util.Arrays;

public class Duplicate {
    static void repeated(int[] arr, int size) {
        boolean visited[] = new boolean[size];

        // for traverse through array
        for (int i = 0; i < size; i++) {
            if (visited[i] == true)
                continue;

            // counting frequency for distinguish repeated element
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 8, 1, 5, 4, 1 };
        int size = arr.length;
        repeated(arr, size);
        // System.out.println("Result is: "+res);
    }

    // private static int repeated(int[] arr, int size) {
    // int i = 0, j, count = 0;
    // while (i < size) {
    // j = i + 1;
    // while (j < size) {
    // if (arr[i] == arr[j]) {
    // count++;
    // break;
    // }
    // j++;
    // }
    // i++;
    // }
    // return count;
    // }
}
// import java.util.Arrays;

// public class RepeatedElement
// {
// static void nonrepeat(int[] arr, int size)
// {

// Arrays.sort(arr);
// for(int i=0; i<size; i++)
// {
// int count=1;
// while(i<size-1 && arr[i]==arr[i+1])
// {
// i++;
// count++;
// }
// if(count>1)
// System.out.print(arr[i]+" ");
// }
// }
// public static void main(String[] args)
// {
// int[] arr={4, 5, 2, 8, 1, 5, 4};
// int size=arr.length;
// nonrepeat(arr, size);
// }
// }
