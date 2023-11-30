package main;

import java.util.Arrays;
import java.util.Scanner;

public class BECodingTask {

	public static void main(String[] args) {
		System.out.println("Max value: " + enterValues());
	}

	public static int enterValues() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size and number of operations separated by whitespace: ");

		int size = scanner.nextInt();
		int[] array = new int[size];

		int numOperations = scanner.nextInt();
		performOperations(scanner, array, numOperations);
		
		scanner.close();

        return Arrays.stream(array).max().orElse(0);
	}

	private static void performOperations(Scanner scanner, int[] array, int numOperations) {
		for(int a = 0; a < numOperations; a++) {
			System.out.print("Enter indexes and value separated by whitespace: ");
			int startIndex = scanner.nextInt();
			int endIndex = scanner.nextInt();
			int value = scanner.nextInt();
			
			addValue(array, startIndex - 1, endIndex - 1, value);
		}		
	}
	
	 public static void addValue(int[] array, int startIndex, int endIndex, int value) {
	        for (int index = startIndex; index <= endIndex; index++) {
	            array[index] += value;
	        }
	    }
}
