import java.util.HashMap;
import java.util.Map;

class HashMapA3 {

    public static Map<Character, Integer> findOccurrences(String input) {
        Map<Character, Integer> occurrenceMap = new HashMap<>();

        // Convert the input string to char array
        char[] characters = input.toCharArray();

        // Iterate through each character
        for (char ch : characters) {
            // Check if the character is already in the map
            if (occurrenceMap.containsKey(ch)) {
                // Increment the count
                occurrenceMap.put(ch, occurrenceMap.get(ch) + 1);
            } else {
                // Add the character with count 1
                occurrenceMap.put(ch, 1);
            }
        }

        return occurrenceMap;
    }

    public static void main(String args[]) {
        String input = "occurrence";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);

        System.out.println("Occurrences of characters\n=======================");
        for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }

}
