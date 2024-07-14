import java.util.ArrayDeque;
import java.util.Deque;

class QueueInterfaceA2 {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
        Deque<Character> auxiliaryStack = new ArrayDeque<>();
        Deque<Character> resultStack = new ArrayDeque<>();

        // Transfer elements from inputStack to auxiliaryStack
        while (!inputStack.isEmpty()) {
            auxiliaryStack.push(inputStack.pop());
        }

        // Remove the bottom three elements from auxiliaryStack and push to resultStack
        int count = 0;
        while (!auxiliaryStack.isEmpty() && count < 3) {
            resultStack.push(auxiliaryStack.pop());
            count++;
        }

        // Transfer remaining elements from auxiliaryStack back to resultStack
        while (!auxiliaryStack.isEmpty()) {
            resultStack.push(auxiliaryStack.pop());
        }

        return resultStack;
    }
    
    public static void main(String[] args) {
        Deque<Character> inputStack = new ArrayDeque<Character>();
        inputStack.push('E');
        inputStack.push('D');
        inputStack.push('C');
        inputStack.push('B');
        inputStack.push('A');
        
        Deque<Character> resultStack = updateStack(inputStack);
        
        System.out.println("The alphabets in updated stack are:");
        for(Character alphabet: resultStack)
            System.out.println(alphabet);
    }
}
