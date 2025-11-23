package important_questions;

public class O2_MinMax {
    static int mini(int[] arr) {
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp)
                temp = arr[i];
        }
        return temp;
    }

    static int maxi(int[] arr) {
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp)
                temp = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 17, 24, 54, 78, 60 };
        // int size = arr.length;
        System.out.println("Minimum number is : "+mini(arr)); 
        System.out.println("Maximum number is : "+maxi(arr)); 
    }
}
