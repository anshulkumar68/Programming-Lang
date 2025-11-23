package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 171, 87, 19, 129, 786, 26, 468};
        sort(arr);
    }
    
    public static void sort(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr)
            System.out.print(i+" ");
    }
}
