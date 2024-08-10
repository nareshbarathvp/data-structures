package sort.selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int unSortedArr[] = { 12, 11, 13, 5, 6 };

        System.out.println("Unsorted Array: ");
        printArr(unSortedArr);

        int sortedArr[] = selectionSort(unSortedArr);
        System.out.println("\n nSorted Array: ");
        printArr(sortedArr);
    }

    static int[] selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
