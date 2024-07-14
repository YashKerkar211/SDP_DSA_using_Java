import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Comparator;

class HashMapA1 {
    
    public static List<String> sortSales(Map<String, Integer> sales) {
        // Convert the map to a list of entries
        List<Entry<String, Integer>> entryList = new ArrayList<>(sales.entrySet());
        
        // Sort the list based on the sales in descending order
        Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                // Sort in descending order of sales
                return e2.getValue().compareTo(e1.getValue());
            }
        });
        
        // Extract employee names in the sorted order
        List<String> sortedEmployees = new ArrayList<>();
        for (Entry<String, Integer> entry : entryList) {
            sortedEmployees.add(entry.getKey());
        }
        
        return sortedEmployees;
    }

    public static void main(String args[]) {
        Map<String, Integer> sales = new HashMap<String, Integer>();
        sales.put("Mathew", 50);
        sales.put("Lisa", 76);
        sales.put("Courtney", 45);
        sales.put("David", 49);
        sales.put("Paul", 49);
        
        List<String> employees = sortSales(sales);
        
        System.out.println("Employees in the decreasing order of their sales\n=====================================");
        for (String employeeName : employees) {
            System.out.println(employeeName);
        }
    }

}
