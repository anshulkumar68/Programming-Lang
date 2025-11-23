package javaPractice.ARRAY;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {3, 29, 9, 28, 12, 44, 52};
        rev(arr);
    }
    static void rev(int[] arr){
        int s=0, e = arr.length-1;
        while(s<=e){
            int temp;
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for(int i : arr)
            System.out.print(i+" ");
    }
}
