import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n]; // read in how many numbers we have
		
		
		int k=0;
		for (int i=0;i<n;i++) { // loop to read all numbers
			int num = sc.nextInt(); // read in a number
			int index = findNumber(num, numbers, k); // check if the number is already in the array.
			if (index<0) { // if not in the array
				numbers[k]=num; // put the number into the array.
				k++; // increase the index for the next new number;
			}
		}
		
		
		System.out.println(k); // print out how many new numbers we have put into the array.
	}

	private static int findNumber(int num, int[] numbers, int k) {
		// TODO Auto-generated method stub
		for (int i=0;i<k;i++) { // loop for all added numbers in the array.
			if (numbers[i]==num) { // check if the number in the array equals the newly read in number
				return i; // if equals, we return the index of the found old number
			}
		}
		
		return -1; // if we cannot find the checked number we return -1 which indicates the checked number is a new number
	}

}
