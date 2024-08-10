package sort.insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int unSortedArr[] = { 12, 11, 13, 5, 6 };

        System.out.println("Unsorted Array: ");
        printArr(unSortedArr);

        int sortedArr[] = insertionSort(unSortedArr);
        System.out.println("\n nSorted Array: ");
        printArr(sortedArr);
    }

    static int[] insertionSort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    static void printArr(int a[]) {
        int n = a.length;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
