package search.front_and_back_search;

public class FrontAndBackSearch {

    public static void main(String[] args) {
        int a[] = { 55, 29, 10, 40, 57, 41, 20, 24, 45 }; // Unsorted array
        int findVal = 45; // Value to be found

        int res = frontBackSearch(a, findVal);
        System.out.println(res);
    }

    public static int frontBackSearch(int arr[], int val) {
        int firstElement = 0, lastElement = (arr.length - 1);

        while (lastElement > firstElement) {
            if (arr[firstElement] == val)
                return firstElement + 1;
            if (arr[lastElement] == val)
                return lastElement + 1;

            lastElement--;
            firstElement++;
        }

        return -1;
    }
}
