class LinkedListExercise1 {

    public static void main(String args[]) {
        LinkedListExercise1 linkedList = new LinkedListExercise1();
        linkedList.addAtEnd("AB");
        linkedList.addAtEnd("BC");
        linkedList.addAtEnd("CD");
        linkedList.addAtEnd("DE");
        linkedList.addAtEnd("EF");

        String elementToBeFound = "CD";
        int position = findPosition(elementToBeFound, linkedList.getHead());
        if (position != 0)
            System.out.println("The position of the element is " + position);
        else
            System.out.println("The element is not found!");
    }

    public static int findPosition(String element, Node head) {
        int position = 1; // Start position from 1

        Node current = head;
        while (current != null) {
            if (current.getData().equals(element)) {
                return position; // Element found, return current position
            }
            current = current.getNext();
            position++; // Move to the next node and increment position
        }

        return 0; // Element not found
    }
}
