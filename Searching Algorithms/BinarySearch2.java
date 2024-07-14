class BinarySearch2 {

	public static int search(int arrayOfElements[], int low, int high, int elementToBeSearched) {
		if (low <= high) {
			int mid = (low + high) / 2;

			if (arrayOfElements[mid] == elementToBeSearched)
				return mid;

			if (arrayOfElements[mid] < elementToBeSearched)
				return search(arrayOfElements, mid + 1, high, elementToBeSearched);

			return search(arrayOfElements, low, mid - 1, elementToBeSearched);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arrayOfElements = { 10, 15, 23, 25, 32, 39, 45, 47, 49, 50 };
		int elementToBeSearched = 50;
		int low = 0;
		int high = arrayOfElements.length - 1;
		int index = search(arrayOfElements, low, high, elementToBeSearched);
		if (index == -1)
			System.out.println("Element is not present in the array!");
		else
			System.out.println("Element is found at index position " + index+"!");
	}
}
