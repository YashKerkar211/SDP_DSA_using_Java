import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        this.queue = new LinkedList<>();
    }

    // Method to add element to the rear of the queue (enqueue)
    public void enqueue(T element) {
        queue.addLast(element);
    }

    // Method to remove and return element from the front of the queue (dequeue)
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty, cannot dequeue");
        }
        return queue.removeFirst();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return queue.size();
    }

    // Method to peek at the front element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty, cannot peek");
        }
        return queue.peekFirst();
    }
}

class LinkedListA4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Display queue size
        System.out.println("Queue size: " + queue.size());

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Display queue size after dequeue
        System.out.println("Queue size after dequeue: " + queue.size());

        // Enqueue another element
        queue.enqueue(40);

        // Dequeue remaining elements
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }

        // Trying to dequeue from an empty queue (should throw exception)
        // queue.dequeue(); // Uncomment to test the exception handling
    }
}
