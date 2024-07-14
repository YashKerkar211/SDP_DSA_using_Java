class LinearSearch {

	public static int search(int arrayOfElements[], int elementToBeSearched) {
		for (int index = 0; index < arrayOfElements.length; index++) {
			// Returning the index of the element if the element is found
			if (arrayOfElements[index] == elementToBeSearched)
				return index;
		}
		// Returning -1 if the element is not found
		return -1;
	}

	public static void main(String[] args) {
		int[] arrayOfElements = { 10, 39, 45, 47, 50, 15, 23, 32, 25, 49 };
		int elementToBeSearched = 50;

		int index = search(arrayOfElements, elementToBeSearched);

		// Checking whether the element has been found or not
		if (index == -1)
			System.out.println("Element is not present in the array!");
		else
			System.out.println("Element is found at index position " + index+"!");
	}
}
