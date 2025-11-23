package javaPractice.ARRAY;

import java.util.Arrays;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 6, 5, 8, 6, 8 };
        frequency3(arr);
    }

    static void frequency(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println("Occurence of " + arr[i] + " in array is: " + count);
        }
    }

    static void frequency2(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : arr) {
            if (frequencyMap.containsKey(element))
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            else
                frequencyMap.put(element, 1);
        }
        // print frequency
        System.out.println("Element : Frequency");
        for (int element : frequencyMap.keySet())
            System.out.println(element + " : " + frequencyMap.get(element));
    }

    static void frequency3(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        // print frequency
        System.out.println("Element : Frequency");
        for (int ele : map.keySet())
            System.out.println(ele + " : " + map.get(ele));
    }
}
