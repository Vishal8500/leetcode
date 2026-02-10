import java.util.*;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the top element
    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.remove();
    }

    // Get top element
    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // 30
        System.out.println(stack.top()); // 20
        System.out.println(stack.empty()); // false
    }
}
