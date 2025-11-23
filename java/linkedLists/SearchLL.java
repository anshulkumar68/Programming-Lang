package linkedLists;
import java.util.LinkedList;

public class SearchLL {
    public static void main(String[] args) {
        // Initializing the Linked List
        LinkedList<Integer> list = new LinkedList<>();
        // Adding elements to the Linked List
        list.add(1);
        list.add(72);
        list.add(36);
        list.add(49);
        list.add(51);
        list.add(36);
        list.add(79);

        System.out.println(list);
        // element need to search
        int key = 49;
        // initializing the answer to the index -1
        int ans = -1;

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element == key) {
                ans = i;
                break;
            }
        }
        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found in linked list at: " + ans);
    }
}

// import java.util.LinkedList;

// class SearchLL{
// public static void main(String[] args)
// {
// // Initializing the Linked List
// LinkedList<Integer> ll = new LinkedList<>();

// // Adding elements to the Linked List
// ll.add(1);
// ll.add(2);
// ll.add(3);
// ll.add(4);
// ll.add(5);
// ll.add(6);
// ll.add(7);

// System.out.println(ll);
// }
// }