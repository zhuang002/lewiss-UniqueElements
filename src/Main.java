import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		/*
		 * The respective classes for primitive types: int -- Integer char -- Character
		 * boolean -- Boolean double -- Double
		 * 
		 */
		ArrayList<Integer> numbers = new ArrayList<>();

		int k = 0;
		for (int i = 0; i < n; i++) { // loop to read all numbers
			int num = sc.nextInt(); // read in a number
			if (!numbers.contains(num)) {
				numbers.add(num);
			}
		}

		System.out.println(numbers.size());

	}

}
