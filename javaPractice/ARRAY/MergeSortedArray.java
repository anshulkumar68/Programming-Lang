package javaPractice.ARRAY;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 9, 22, 79, 84 };
        int[] arr2 = { 5, 7, 19, 87 };
        merge(arr1, arr2);
    }

    static void merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(i<arr1.length && i<arr2.length){
            if(arr1[i]<arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        // copy remaining element for 1 array
        while(i<arr1.length)
            arr3[k++] = arr1[i++];

        // copy remaining element for 2 array
        while(j<arr2.length)
            arr3[k++] = arr2[j++];
        
        // print array
        for(int ele : arr3)
            System.out.print(ele+" ");
    }
}
