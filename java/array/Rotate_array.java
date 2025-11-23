package array;

public class Rotate_array 
{
    static void rotate(int[] arr, int size, int k)
    {
        int[] temp = new int[size];
        for(int i=0; i<size; i++){
            temp[(i+k)%size] = arr[i];
        }
        for(int i=0; i<size; i++){
            System.out.print(temp[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr=  { 10, 20, 30, 40, 50, 60, 70 };
        int size = arr.length;
        int key=2;
        rotate(arr, size, key);
    }    
}
