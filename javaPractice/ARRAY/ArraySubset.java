package javaPractice.ARRAY;

public class ArraySubset {
    public static void main(String[] args) {
        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        int arr2[] = { 11, 30, 13, 70};
        if(subset(arr1, arr2))
            System.out.println("arr2 is subset of arr1");
        else
            System.out.println("arr2 is not subset of arr1");
    }

    static boolean subset(int[] arr1, int[] arr2){
        int i = 0, j=0;
        for(i=0; i<arr2.length; i++){
            for(j=0; j<arr1.length; j++){
                if(arr2[i] == arr1[j])
                    break;
            }
            if(j==arr1.length)
                return false;
        }
        return true;
    }
}
