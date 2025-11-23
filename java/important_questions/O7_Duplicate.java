package important_questions;

public class O7_Duplicate {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 3, 4, 2, 2, 5 };
        int size = arr.length;
        dupli(arr, size);
        // System.out.println("Number of duplicate is :"+); 
    }

    private static void dupli(int[] arr, int size) {
        boolean[] visited = new boolean[size];
        // for traversal through array
        for (int i = 0; i < size; i++) {
            if (visited[i] == true)
                continue;

            // for frequency
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
