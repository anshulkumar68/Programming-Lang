package hashing;
import java.util.*;

public class Union {
    public static int Unionset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 8, 3 };
        int[] arr2 = { 3, 9, 5, 8, 9 };
        System.out.println(Unionset(arr1, arr2));
        System.out.println();
    }
}
