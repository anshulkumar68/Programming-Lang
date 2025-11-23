package queue;
// package QUEUE;
public class LinkedListQueue {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // enqueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                tail = head = newNode;
            }
            tail.next = newNode;
            tail = newNode; 
        }

        // dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("QUeue is empty");
                return -1;
            }
            int front = head.data;
            // single node
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("QUeue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(4);
        q.add(8);
        q.add(12);
        q.add(16);
        q.add(20);
    
        System.out.println("first removal");
        System.out.println(q.remove());

        q.add(24);

        System.out.println("second removal");
        System.out.println(q.remove()+"\n");

        q.add(28);

        System.out.println("Linked list after removal");

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println();
    }
}
