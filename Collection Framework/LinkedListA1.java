import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class LinkedListA1 {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        // HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        // LinkedList to store result
        List<Integer> result = new LinkedList<>();

        // Iterate through the input list
        for (Integer num : list) {
            // Add to set only if it's not already present
            if (set.add(num)) {
                // If added to set (i.e., it's unique), add to result list
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(15);
        list.add(10);

        List<Integer> updatedList = removeDuplicates(list);

        System.out.println("Linked list without duplicates:");
        for (Integer value : updatedList) {
            System.out.print(value + " ");
        }
    }
}
