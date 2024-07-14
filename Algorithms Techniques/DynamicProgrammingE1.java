class DynamicProgrammingE1 {

    public static int cutRod(int[] price, int n) {
        // Create an array to store results of subproblems
        int[] maxPrice = new int[n + 1];
        
        // Base case: maxPrice[0] is 0 (no rod, no price)
        maxPrice[0] = 0;
        
        // Solve subproblems from 1 to n
        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                maxVal = Math.max(maxVal, price[j - 1] + maxPrice[i - j]);
            }
            maxPrice[i] = maxVal;
        }
        
        // Return the maximum price for rod of length n
        return maxPrice[n];
    }

    public static void main(String[] args) {
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = 4;
        System.out.println("Maximum price: " + cutRod(price, n));
    }
}
