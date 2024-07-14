import java.util.Deque;
import java.util.ArrayDeque;

class QueueInterfaceE2 {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            return stack;
        }
        
        Deque<Integer> tempStack = new ArrayDeque<>();
        int smallest = Integer.MAX_VALUE;
        int smallestCount = 0;
        
        // Step 1: Find the smallest element and count its occurrences
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current < smallest) {
                smallest = current;
                smallestCount = 1;
            } else if (current == smallest) {
                smallestCount++;
            }
            tempStack.push(current);
        }
        
        // Step 2: Rebuild the stack, placing non-smallest elements in tempStack
        int nonSmallestCount = tempStack.size() - smallestCount;
        Deque<Integer> resultStack = new ArrayDeque<>();
        
        while (!tempStack.isEmpty()) {
            int current = tempStack.pop();
            if (current != smallest) {
                resultStack.push(current);
            }
        }
        
        // Step 3: Push smallest elements to the bottom of the resultStack
        for (int i = 0; i < smallestCount; i++) {
            resultStack.push(smallest);
        }
        
        return resultStack;
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        
        Deque<Integer> updatedStack = changeSmallest(stack);
        
        System.out.println("Updated Stack:");
        while (!updatedStack.isEmpty()) {
            System.out.println(updatedStack.pop());
        }
    }
}
