// Importing input output classes
import java.io.*;
// Importing all utility classes
import java.util.*;

// User-defined class for generic stack
class Stack<T> {

    // ArrayList to store stack elements
    private ArrayList<T> A;

    // Variable to store the top index of the stack
    private int top = -1;

    // Variable to store the size of the stack
    private int size;

    // Constructor of this class
    // To initialize the stack with a given size
    public Stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    // Method to push a generic element into the stack
    public void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            A.add(X); // Add the element directly to the ArrayList
        }
    }

    // Method to return the topmost element of the stack
    public T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return A.get(top);
        }
    }

    // Method to delete the last element of the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    // Method to check if the stack is empty or not
    public boolean empty() {
        return top == -1;
    }

    // Method to print the stack
    @Override
    public String toString() {
        StringBuilder Ans = new StringBuilder();
        for (int i = 0; i <= top; i++) { // Include the top element
            Ans.append(A.get(i));
            if (i != top) {
                Ans.append("->");
            }
        }
        return Ans.toString();
    }
}

// Main Class
public class GFG {

    // Main driver method
    public static void main(String[] args) {
        // Integer Stack
        Stack<Integer> s1 = new Stack<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("s1 after pushing 10, 20, and 30:\n" + s1);
        s1.pop();
        System.out.println("s1 after pop:\n" + s1);

        // String Stack
        Stack<String> s2 = new Stack<>(3);
        s2.push("hello");
        s2.push("world");
        s2.push("java");
        System.out.println("\ns2 after pushing 3 elements:\n" + s2);
        s2.push("GFG"); // Will now print a Stack Overflow message
        System.out.println("s2 after pushing 4th element:");

        // Float Stack
        Stack<Float> s3 = new Stack<>(2);
        s3.push(100.0f);
        s3.push(200.0f);
        System.out.println("\ns3 after pushing 2 elements:\n" + s3);
        System.out.println("top element of s3:\n" + s3.top());
    }
}
