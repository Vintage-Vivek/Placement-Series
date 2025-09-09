package AdvanceDSA.Queues;

public class CircularQueueArray {

    static class Queue {

        static int arr[];
        static int size;

        static int rear = -1;
        static int front = -1;

        @SuppressWarnings("static-access")
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // An extra condition of Queue full arises here

        // Codition of row getting full
        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        // Adding or enqueue
        static void add(int data) {
            if (isFull()) {
                System.out.println("Full");
                return;
            }
            // if adding first element
            if(front == -1) {
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // Removing or dequeue
        static int remove() {
            if(isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int result = arr[front];
            // Single element condition
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front+1)%size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("removing 1st time:- "+q.remove());
        q.add(6);
        
        System.out.println("removing 2nd time:- "+q.remove());
        q.add(7);

        int i = 2;
        while(!q.isEmpty()) {
            System.out.println("Index "+i+" :- "+q.peek());
            if (i==4) {
                i = 0;
                i--;
            }
            i++;
            q.remove();
        }
    }
}