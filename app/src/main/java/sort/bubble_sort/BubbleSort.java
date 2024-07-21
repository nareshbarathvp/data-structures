package sort.bubble_sort;

public class BubbleSort {

    public static void main(String[] args) {
        int unSortedArr[] = { 35, 10, 31, 11, 26 };
        System.out.println("Unsorted Array: ");
        printArr(unSortedArr);

        int sortedArr[] = bubbleSort(unSortedArr);
        System.out.println("\nnSorted Array: ");
        printArr(sortedArr);
    }

    static int[] bubbleSort(int a[]) {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    static void printArr(int a[]) {
        int n = a.length;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
