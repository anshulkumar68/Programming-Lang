package array;
// import java.util.Arrays;

// public class Frequency {
//     public static void main(String[] args) {
//         int[] arr = { 10, 30, 10, 20, 10, 20, 30, 10 };
//         Arrays.sort(arr);
//         for(int i=0; i<arr.length; i++){
//             int count = 1;
//             while(i < arr.length -1 && arr[i] == arr[i+1]){
//                 i++;
//                 count++;
//             }
//             System.out.println(arr[i]+" occurs "+count+" times");
//         }
//     }
// }
 



public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 21, 31, 21, 40, 31, 21};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        //for traversal through array
        for(int i=0; i<n; i++){ 
            //checking if the element already visited 
            if(visited[i]==true)
                continue;
            
            //for frequency
            int count =1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("Frequency of "+arr[i]+" : "+count);
        }
    }
}