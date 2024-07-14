import java.util.ArrayList; // Importing the ArrayList class
import java.util.List;

class ArrayList1 {
	public static void main(String[] args) {
		List<String> food = new ArrayList<String>(); // Creating a list of String elements
		food.add("Pizza"); // Adding elements
		food.add("Burger");
		food.add("Pasta");
		food.add("Sandwich");
		System.out.println("Food items: " + food);
	}
}