class GreedyApproach {

    public static int findMaxActivities(int start[], int finish[]) {
        int n = start.length;
        if (n == 0) return 0;
        
        // Initialize count of activities
        int count = 1;
        
        // First activity is always selected
        int lastFinishTime = finish[0];
        
        // Iterate over remaining activities
        for (int i = 1; i < n; i++) {
            // If this activity has start time greater than or equal to
            // the finish time of the last selected activity, then select it
            if (start[i] >= lastFinishTime) {
                count++;
                lastFinishTime = finish[i];
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};

        System.out.println("Maximum number of activities: " + findMaxActivities(start, finish));
    }
}
