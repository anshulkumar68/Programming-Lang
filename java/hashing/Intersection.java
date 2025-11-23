package hashing;
import java.util.*;

public class Intersection {
    public static int Intersectionset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 8, 3 ,5};
        int[] arr2 = { 3, 9, 5, 8, 1, 2, 5};
        System.out.println(Intersectionset(arr1, arr2)); 
    }
}
