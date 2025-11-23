// LARGEST THREE
package array;
public class Largest_three 
{
    public static void main(String[] args)
    {
        int[] arr = {24, 701, 202, 983, 345};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE ;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second){
                third = second;
                second =arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        System.out.println("First largest element is:"+first);
        System.out.println("Second largest element is:"+second);
        System.out.println("Third largest element is:"+third);
    }
}


// SMALLEST THREE


// public class Largest_three 
// {
//     public static void main(String[] args)
//     {
//         int[] arr = {24, 701, 202, 983, 345};
//         int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE ;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]<first){
//                 third = second;
//                 second = first;
//                 first = arr[i];
//             }
//             else if(arr[i]<second){
//                 third = second;
//                 second =arr[i];
//             }
//             else if(arr[i]<third){
//                 third = arr[i];
//             }
//         }
//         System.out.println("First smallest element is:"+first);
//         System.out.println("Second smallest element is:"+second);
//         System.out.println("Third smallest element is:"+third);
//     }
// }
