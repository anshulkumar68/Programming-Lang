package javaPractice.ARRAY;

import java.util.HashMap;

public class Distinct {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 6, 5, 8, 6, 8 };
        distinct(arr);

    }

    static void distinct(int[] arr) {
        HashMap<Integer, Integer> distinctMap = new HashMap<>();

        for (int i : arr) {
            distinctMap.put(i, 1);
        }
        // print distinct element
        System.out.println("Distinct element is");
        for (int i : distinctMap.keySet())
            System.out.println(i);
    }
}
