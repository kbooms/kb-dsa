package lists;

import java.util.LinkedList;

public class LinkedLists {
    /* Where Arrays and ArrayLists have difficulty Inserting and Deleting data elements
     * LinkedLists have an advantage. With insertion, there is no shifting of elements involved.
     * LinkedLists are made up of a long chain of nodes. Each node contains two parts. Some data that
     * we need to store and an address to the next node in line, or pointer. These nodes are
     * non-contiguous, and can be anywhere in the computer's memory. Each node knows where the next node
     * resides. We know when we've reached the end of the list when the memory address is checked, and the
     * value is null. It means we're at the tail, the end of the linked list.
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // you can treat a LinkedList like a stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();
        // you can treat a LinkedList like a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        linkedList.add(4, "E");
        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);
    }
}
