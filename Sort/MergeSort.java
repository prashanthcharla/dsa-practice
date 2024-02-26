import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted: " + Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	/**
	 * Divides the input array into two halves based on the mid pointer. Merges two
	 * halves in sorted order.
	 * 
	 * @param arr
	 * @param left
	 * @param mid
	 * @param right
	 */
	public static void merge(int[] arr, int left, int mid, int right) {
		int leftSize = mid - left + 1;
		int rightSize = right - mid;

		int[] leftArr = new int[leftSize];
		int[] rightArr = new int[rightSize];

		for (int i = 0; i < leftSize; i++) {
			leftArr[i] = arr[left + i];
		}

		for (int i = 0; i < rightSize; i++) {
			rightArr[i] = arr[mid + 1 + i];
		}

		// Merge left & right array in sorted order.

		int i = 0, j = 0, k = left;
		while (i < leftSize && j < rightSize) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
				k++;
			} else {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}

		while (i < leftArr.length) {
			arr[k++] = leftArr[i++];
		}

		while (j < rightArr.length) {
			arr[k++] = rightArr[j++];
		}
	}
}
