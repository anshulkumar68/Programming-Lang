package queue;
import java.util.*;

public class PreQueue {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);  // works same as add method
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);

        
        System.out.println(queue);

        System.out.println(queue.poll());  // works same as remove method for deleting 
        System.out.println(queue.remove());
        // System.out.println(queue.remove());

        System.out.println(queue.peek());  // works same as element method for watching the front element

        // System.out.println(queue.element());
    }
    
}
