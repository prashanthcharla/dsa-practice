public class BinarySearch {
    public static int search(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;

        if(start > end) return -1;

        if(arr[mid] == target) return mid;
        else if (target > arr[mid]) return search(arr, mid + 1, end, target);
        else return search(arr, start, mid-1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,78,90,100};
        System.out.println(search(arr, 0, arr.length - 1, 100));
    }
}
