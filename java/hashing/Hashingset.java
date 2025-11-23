package hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hashingset 
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert element
        set.add(6);
        set.add(7);
        set.add(2);
        set.add(2);

        //Search - contains
        if(set.contains(6))
            System.out.println("Set contains 6");
        if(!set.contains(5))
            System.out.println("Set does not contains 5");  

        //Delete
        set.remove(76);
        if(!set.contains(76))
            System.out.println("Set contains 76");

        //Size
        System.out.println("Size is :"+set.size());

        //Print all element
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println("\n"+"Using for loop : ");
        for(int ele : set){
            System.out.print(ele+" ");
        }
    }
}


