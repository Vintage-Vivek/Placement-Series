package AdvanceDSA.Queues;

import java.util.Queue;
import java.util.LinkedList;

public class QueueCFW {
    public static void main(String[] args) {
        
        Queue <Integer> q = new LinkedList<>();
        // Also
        // Queue <Integer> q = new ArrayDeque<>();
        // Deque - double ended queue
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
