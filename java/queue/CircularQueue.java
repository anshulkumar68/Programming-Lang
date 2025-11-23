package queue;
// package QUEUE;

public class CircularQueue 
{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        
        Queue(int size){
            this.size = size;
            arr = new int[size];
        }
        
        public static boolean isEmpty(){
            return rear == -1 && front ==-1;
        }

        public static boolean isFull(){
            return (rear +1)%size == front;
        }

        //enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            // if it's the 1st element
            if(front == -1){
                front =0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }
        
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("QUeue is empty");
                return -1;
            }
            int res = arr[front];

            // if only 1 element is present
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return res;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("QUeue is empty");
                return -1;
            }
            return arr[front];
        }
    }    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(4);
        q.add(8);
        q.add(12);
        q.add(16);
        q.add(20);
        System.out.println(q.remove());
        q.add(24);
        System.out.println("after first remove");
        System.out.println(q.remove());
        q.add(28);
        System.out.println("after second remove");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println();
    }
}
