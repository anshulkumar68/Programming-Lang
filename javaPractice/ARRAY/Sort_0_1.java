package javaPractice.ARRAY;

public class Sort_0_1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 0 };
        sort1(arr);
    }

    static void sort(int[] arr){
        int s=0, e=arr.length-1;
        while(s<=e){
            if(arr[s]==0)
                s++;
            else if(arr[e]==1)
                e--;
            else if(arr[s]==1 && arr[e]==0 && s<e){
                arr[s++] = 0;
                arr[e--] = 1;
            }
        }
        for(int ele : arr)
            System.out.print(ele+" ");
    }

    static void sort1(int[] arr){
        int s=0, e = arr.length-1;
        while(s<=e){
            if(arr[s]==0)
                s++;
            else if(arr[e]==1)
                e--;
            else if(arr[s]==1 && arr[e]==0 &&s<e){
                arr[s++]=0;
                arr[e--]=1;
            }
        }
        for(int ele : arr)
            System.out.print(ele+" ");
    }
}

