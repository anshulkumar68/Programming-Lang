package queue;
// package QUEUE;

public class SingularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("QUeue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("QUeue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(4);
        q.add(8);
        q.add(12);
        q.add(16);
        q.add(20);
        q.add(24);
        

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
