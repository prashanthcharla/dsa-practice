import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Final: " + Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, 0, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	/**
	 * Rearranges the array in place based on the pivot element. All the elements
	 * which are less than pivot will be placed left to pivot and remaining numbers
	 * to the right.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return rearranged array
	 */
	public static int partition(int[] arr, int low, int high) {
		// Can be first or last element (or) mid element (or) median of first, mid and
		// last
		int pivot = arr[high];

		// Pointer to track & contain the smallest numbers to pivot
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swapTwoNumbers(arr, i, j);
			}
		}

		// Keep the pivot in right position
		swapTwoNumbers(arr, i + 1, high);

		return i + 1;
	}

	private static void swapTwoNumbers(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
