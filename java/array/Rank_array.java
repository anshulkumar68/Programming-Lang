package array;
// import java.lang.reflect.Array;
import java.util.Arrays;

// Java program to replace each element by its rank in the given array

class Rank_array
{
    static void changeArr(int[] OGarr)
    {
        int temp[]=Arrays.copyOfRange(OGarr, 0, OGarr.length);
        Arrays.sort(temp);
        for(int i=0; i<OGarr.length; i++){
            for(int j=0; j<OGarr.length; j++){
                if(temp[j]==OGarr[i])
                {  
                    OGarr[i]=j+1;
                    break;
                }
            }
        }

        //  New array according to rank
        // for(int i=0; i<OGarr.length; i++)
        // System.out.print(OGarr[i]+" ");
    }
    public static void main(String[] args)
    {
        int[] OGarr={234, 128, 12, 908, 32}; 
        changeArr(OGarr);
        System.out.println(Arrays.toString(OGarr));
    }
}