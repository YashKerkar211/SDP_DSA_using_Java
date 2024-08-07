import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class LinkedListA2 {
    
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
        Set<Integer> set = new HashSet<>(listOne); // HashSet to store elements of listOne
        List<Integer> result = new LinkedList<>(); // LinkedList to store common elements
        
        for (Integer num : listTwo) {
            if (set.contains(num)) {
                result.add(num); // Add to result if the element exists in both lists
            }
        }
        
        return result;
    }
    
    public static void main(String args[]){
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(12);
        listOne.add(21);
        listOne.add(1);
        listOne.add(53);
        
        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(11);
        listTwo.add(21);
        listTwo.add(25);
        listTwo.add(53);
        listTwo.add(47);
        
        System.out.println("Common elements between listOne and listTwo:");
        System.out.println(findCommonElements(listOne, listTwo));
    }
}
