package oops;
import java.util.ArrayList;
import java.util.Collections;
// package ArrayList;

public class ArrayL
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(46);
        list.add(88);
        list.add(69);

        System.out.println(list);

        //get element
        int ele = list.get(1);
        System.out.println(ele);

        // add something in between
        list.add(1, 3);
        System.out.println(list);

        //set element
        list.set(0, 206);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<size; i++)
            System.out.print(list.get(i)+" ");
        
        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }    
}


// get element
// size
// add
// set
// delete
