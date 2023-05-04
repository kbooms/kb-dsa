package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    /*
     * Queues are FIFO (First-In First-Out) Data Structures. Similar to the way
     * a waiting line of people works. First person in line is the first person
     * to be helped.
     *
     * add    = "enqueue"  uses offer() method
     * remove = "dequeue"  uses poll() method
     */

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue.isEmpty());
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
