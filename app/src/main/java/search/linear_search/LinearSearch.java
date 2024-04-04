package search.linear_search;

public class LinearSearch {

    public static void main(String[] args) {
        int a[] = { 55, 29, 10, 40, 57, 41, 20, 24, 45 }; // Unsorted array
        int findVal = 20; // Value to be found
        int res = linearSearch(a, findVal); // Implimenting linear search
        System.out.println(res);
    }

    private static int linearSearch(int arr[], int val) {
        int len = arr.length; // Length of the array

        /* Looping through the array one by one */
        for (int i = 0; i < len; i++) {
            if (arr[i] == val)
                return i + 1; // Retun the position of the value
        }
        return -1; // If the given number is not found in the array
    }
}
