package hashing;
import java.util.*;

public class MajorityElement 
{
    public static void Majority(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){ // for traverse each array element
            if(map.containsKey(nums[i])){   // true
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{   // false
                map.put(nums[i], 1);
            }
        }
        // finding the occurence
        for(int key : map.keySet()){
            if(map.get(key)>3){
                System.out.print(key+" "+"\n");
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 2, 5, 4 , 7, 4 , 4, 7, 7, 7};
        Majority(nums);
    }
}









