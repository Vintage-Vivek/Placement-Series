package AdvanceDSA.Queues;

public class QueueArray {
    static class Queue {

        static int arr[];
        static int size;

        static int rear = -1;

        @SuppressWarnings("static-access")
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Adding or enqueue
        static void add(int data) {
            if(rear == size-1) {
                System.out.println("Full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Removing or dequeue
        static int remove() {
            if(isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
