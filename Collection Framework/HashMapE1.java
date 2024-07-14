import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    
    public static Map<String, Object> findMaxMinScorers(Map<String, Double> studentMarks) {
        Map<String, Object> maxMinScorers = new HashMap<>();
        
        // Initialize variables to track maximum and minimum marks
        double maxMarks = Double.MIN_VALUE;
        double minMarks = Double.MAX_VALUE;
        
        // Variables to store names of students who scored max and min marks
        List<String> maxScorers = new ArrayList<>();
        List<String> minScorers = new ArrayList<>();
        
        // Iterate through the studentMarks map
        for (Map.Entry<String, Double> entry : studentMarks.entrySet()) {
            String name = entry.getKey();
            double marks = entry.getValue();
            
            // Check for maximum marks
            if (marks > maxMarks) {
                maxMarks = marks;
                maxScorers.clear();
                maxScorers.add(name);
            } else if (marks == maxMarks) {
                // Append if multiple students have the same maximum marks
                maxScorers.add(name);
            }
            
            // Check for minimum marks
            if (marks < minMarks) {
                minMarks = marks;
                minScorers.clear();
                minScorers.add(name);
            } else if (marks == minMarks) {
                // Append if multiple students have the same minimum marks
                minScorers.add(name);
            }
        }
        
        // Add results to maxMinScorers map
        maxMinScorers.put("Max Marks", maxMarks);
        maxMinScorers.put("Max Scorers", maxScorers);
        maxMinScorers.put("Min Marks", minMarks);
        maxMinScorers.put("Min Scorers", minScorers);
        
        return maxMinScorers;
    }

}

class HashMapE1 {

    public static void main(String args[]) {
        Map<String, Double> studentMarks = new HashMap<>();
        studentMarks.put("Lily", 90.0);
        studentMarks.put("Robin", 68.0);
        studentMarks.put("Marshall", 76.5);
        studentMarks.put("Neil", 67.0);
        studentMarks.put("Ted", 92.0);
        
        Map<String, Object> maxMinScorers = Student.findMaxMinScorers(studentMarks);
        
        System.out.println("Details of Top Scorers & Low Scorers\n====================================");
        System.out.println("Maximum Marks: " + maxMinScorers.get("Max Marks"));
        System.out.println("Achieved by: " + maxMinScorers.get("Max Scorers"));
        System.out.println("Minimum Marks: " + maxMinScorers.get("Min Marks"));
        System.out.println("Achieved by: " + maxMinScorers.get("Min Scorers"));
    }
}
