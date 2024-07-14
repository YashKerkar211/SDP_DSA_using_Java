import java.util.Deque;
import java.util.ArrayDeque;

class QueueInterfaceE1 {
    
    public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {
        Deque<Object> mergedQueue = new ArrayDeque<>();
        
        // Get the sizes of both queues
        int size1 = intQueue.size();
        int size2 = charQueue.size();
        
        // Merge elements at the same position
        int minSize = Math.min(size1, size2);
        for (int i = 0; i < minSize; i++) {
            mergedQueue.add(intQueue.poll());
            mergedQueue.add(charQueue.poll());
        }
        
        // Add remaining elements from intQueue, if any
        while (!intQueue.isEmpty()) {
            mergedQueue.add(intQueue.poll());
        }
        
        // Add remaining elements from charQueue, if any
        while (!charQueue.isEmpty()) {
            mergedQueue.add(charQueue.poll());
        }
        
        return mergedQueue;
    }

    public static void main(String[] args) {
        Deque<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.add(3);
        integerQueue.add(6);
        integerQueue.add(9);
        
        Deque<Character> characterQueue = new ArrayDeque<>();
        characterQueue.add('a');
        characterQueue.add('e');
        characterQueue.add('i');
        characterQueue.add('o');
        characterQueue.add('u');
        characterQueue.add('b');
        
        Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);
        
        System.out.println("The elements in the merged queue are:");
        for (Object element : mergedQueue) {
            System.out.println(element);
        }
    }
}
