package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    /*
     * Stack = LIFO (Last in-First out) data Structure
     * stores objects into a sort of "vertical tower"
     * push() to add to the top
     * pop() to remove from the top
     */

    public static Stack makeStack() {
        Stack<String> stack = new Stack<String>();
        stack.push("Mass Effect 2");
        stack.push("Super Mario World");
        stack.push("Earthbound");
        stack.push("Ultima Online");
        stack.push("World of Warcraft");
        return stack;
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        // this empty() method returns a boolean based on whether or not a stack is empty
        System.out.println(stack.empty() + ", the stack is empty");

        // now add items to the stack
        stack = makeStack();

        // empty() method should now return false as we have added data to the stack
        System.out.println(stack.empty() + ", the stack has data");

        // look at all the items in the stack
        System.out.println("Size: " + stack.size() + " " + stack);

        // how does the stack change as we pop each individual piece?
        while (stack.size() > 0) {
            System.out.println("Removing: " + stack.peek()); // use peek method to view the top piece of the stack
            stack.pop();// remove the top
            System.out.println("Size: " + stack.size() + " " + stack); // view the stack
        }

        // if we try to pop from an empty stack it will throw an error
//        stack.pop();

        stack = makeStack();
        System.out.println("Reset Stack: " + stack);

        Scanner in = new Scanner(System.in);
        System.out.print("Position search | Enter a stack item: ");
        String search = in.nextLine();
        if (stack.contains(search)) {
            System.out.println(search + " location in stack: " + stack.search(search));
        } else {
            System.out.println(search + " not found in Stack");
        }
    }
}
