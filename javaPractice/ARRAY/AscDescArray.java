package javaPractice.ARRAY;

public class AscDescArray {
    public static void main(String[] args) {
        int[] arr = {89, 13, 279, 198, 127, 76, 123, 28};
        int size = arr.length;
        arrange(arr, size);
    }

    static void arrange(int[] arr, int size){
        int temp;
        for(int i=0; i<size/2-1; i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        // desc
        for(int i=size/2; i<size-1; i++){
            if(arr[i]<arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
