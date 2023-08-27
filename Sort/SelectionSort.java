package core_java_practice.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int min = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[min]) {
					min = j;
				}
			}

			int temp = input[i];
			input[i] = input[min];
			input[min] = temp;
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

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}

}
