package important_questions;

import java.util.Arrays;

public class O8_Frequency {
    public static void main(String[] args) {
        int[] arr = {6, 1, 98, 2, 98, 2, 98};
        int size = arr.length;
        freq(arr, size);
    }

    private static void freq(int[] arr, int size) {
        Arrays.sort(arr);
        for(int i=0; i<size; i++){
            int count=1;
            while(i<size-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+" occurs "+count+" times");
        }
    }
    
}
