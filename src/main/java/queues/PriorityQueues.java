package queues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    // Like Queues, Priority Queues are a FIFO data structure.
    // Elements in the Queue are given a priority
    // The queue serves Higher priority Elements first, and lower priority elements second

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        // establishing a Priority Queue will add elements in an Ascending sorted order
        // setting the () of the PriorityQueue<>() to (Collections.reverseOrder()) can reverse the sorted order

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
