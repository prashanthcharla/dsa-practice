package core_java_practice.sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	// My first implementation. 
	public static void sort(int[] input) {
		if (input.length > 0) {
			for (int i = 0; i < input.length - 1; i++) {
				for (int j = i + 1; j < input.length; j++) {
					int topIndex = i;
					while (topIndex >= 0) {
						if (input[topIndex] > input[j]) {
							int temp = input[j];
							input[j] = input[topIndex];
							input[topIndex] = temp;
						}
						topIndex--;
					}
				}
			}
		}
	}

	// Optimized implementation
	public static void sort2(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int current = input[i];
			int j = i - 1;

			while (j >= 0 && input[j] > current) {
				input[j + 1] = input[j];
				j--;
			}

			input[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		sort2(arr);

		System.out.println(Arrays.toString(arr));

	}

}
