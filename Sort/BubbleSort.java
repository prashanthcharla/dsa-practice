package core_java_practice.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void sort(int[] input) {
		for (int i = input.length - 1; i >= 0; i--) {
			boolean swapped = false;
			for (int j = 0; j < i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped)
				break;
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
