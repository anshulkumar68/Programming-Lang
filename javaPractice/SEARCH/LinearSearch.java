public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 89, 123, 13, 80, 179, 269, 130 };
        int res = search(arr, 17);
        if(res!=-1)
            System.out.println("Element found at : "+ res);
        else
            System.out.println("Element not found");
    }

    static int search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i])
                return i;
        }
        return -1;
    }
}
