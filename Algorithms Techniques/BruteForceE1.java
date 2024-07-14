class BruteForceE1 {
	 
	public static int calculatePower(int num, int p) {
	    if (p == 0) {
	        return 1; // Any number to the power of 0 is 1
	    }
	    
	    int power = 1;
	    int base = num;
	    
	    for (int i = 1; i <= p; i++) {
	        power *= base;
	    }
	    
	    return power;
	}
	
	public static void main(String[] args) {
		System.out.println(calculatePower(2, 3)); // Example: 2^3 = 8
		System.out.println(calculatePower(5, 0)); // Example: 5^0 = 1
		System.out.println(calculatePower(3, 4)); // Example: 3^4 = 81
		System.out.println(calculatePower(10, 2)); // Example: 10^2 = 100
		System.out.println(calculatePower(1, 5)); // Example: 1^5 = 1
	}
}
