import java.util.ArrayList;
import java.util.List;

class ArrayList2 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();  // Creating an ArrayList object
		// Adding the elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		System.out.println("numbers list: " + numbers);

		// Adding the number 15 at a particular index (index: 3) in the ArrayList
		numbers.add(3, 15);
		System.out.println("Observe the index position 3: " + numbers);

		// Finding the size of the ArrayList
		System.out.println("Size of the ArrayList: " + numbers.size());

		// Retrieving the element at a specified index
		System.out.println("The number present at the fifth index position is " + numbers.get(5));

		// Modifying the element at a specified index (index: 2)
		numbers.set(2, 200);
		System.out.println("The number at the 2nd index position is changed from 3 to 200");

	}
}