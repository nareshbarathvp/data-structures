package search.binary_search;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = { 8, 10, 22, 27, 37, 44, 49, 55, 69 }; // Sorted array
        int val = 8; // Value to be found
        int res = binarySearch(a, 0, a.length - 1, val);
        System.out.println(res);
    }

    static int binarySearch(int arr[], int start, int end, int val) {
        int midPoint;

        /* Till there are no elements to search */
        if (end >= start) {
            midPoint = (start + end) / 2; // Finding the midpoint of the array
            if (arr[midPoint] == val) {
                return midPoint + 1; // Position of the found value
            }

            else if (arr[midPoint] < val) {
                return binarySearch(arr, midPoint + 1, end, val); // Right shit recussion
            }

            else {
                return binarySearch(arr, start, midPoint - 1, val); // Left shift recussion
            }
        }

        return -1; // Value not found
    }
}
