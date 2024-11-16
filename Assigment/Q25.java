class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize stack
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    // Method to add element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to stack.");
        }
    }
    // Method to remove element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from stack.");
            return value;
        }
    }
    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Q25 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element after popping is: " + stack.peek());
    }
}
