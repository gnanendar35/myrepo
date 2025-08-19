public class BinarySearch {
    // Returns the index of key in arr if present, else -1
    public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2; // To avoid overflow

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1) {
            System.out.println(key + " not found in the array.");
        } else {
            System.out.println(key + " found at index " + result);
        }
    }
}
