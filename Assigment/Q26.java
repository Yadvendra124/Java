class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    private int nItems;

    // Constructor to initialize the queue
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
            System.out.println("Enqueued " + value);
        }
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            System.out.println("Dequeued " + temp);
            return temp;
        }
    }

    // Method to peek the front element of the queue
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }
}

public class Q26 {

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        System.out.println("Front element is: " + queue.peekFront());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element after dequeuing is: " + queue.peekFront());
    }
}
