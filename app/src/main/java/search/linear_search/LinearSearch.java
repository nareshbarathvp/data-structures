package search.linear_search;

public class LinearSearch {
    private static int linearSearch(int arr[], int val) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == val)
                return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 55, 29, 10, 40, 57, 41, 20, 24, 45 };
        int findVal = 20;
        int res = linearSearch(a, findVal);
        System.out.println(res);
    }
}
