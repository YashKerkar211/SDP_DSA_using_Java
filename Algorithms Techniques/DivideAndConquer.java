class DivideAndConquer {
	
	public static int[] getMaxMin(int arr[], int low, int high) { 
	    int[] result = new int[2];
	    
	    if (low == high) {
	        // Only one element in the array
	        result[0] = arr[low]; // max
	        result[1] = arr[low]; // min
	        return result;
	    }
	    
	    if (high - low == 1) {
	        // Two elements in the array
	        if (arr[low] > arr[high]) {
	            result[0] = arr[low]; // max
	            result[1] = arr[high]; // min
	        } else {
	            result[0] = arr[high]; // max
	            result[1] = arr[low]; // min
	        }
	        return result;
	    }
	    
	    // Divide the array into two halves
	    int mid = (low + high) / 2;
	    int[] leftMinMax = getMaxMin(arr, low, mid);
	    int[] rightMinMax = getMaxMin(arr, mid + 1, high);
	    
	    // Merge the results
	    result[0] = Math.max(leftMinMax[0], rightMinMax[0]); // max
	    result[1] = Math.min(leftMinMax[1], rightMinMax[1]); // min
	    
	    return result;
	} 
	  
	public static void main(String args[]) { 
	    int arr[] = {1000, 10, 5, 1, 2000}; 

	    int[] maxMin = getMaxMin(arr, 0, arr.length - 1);
	    
	    System.out.println("Minimum value is " + maxMin[1]); 
	    System.out.println("Maximum value is " + maxMin[0]); 
	} 
}
