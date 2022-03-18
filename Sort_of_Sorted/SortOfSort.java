public class SortOfSort {
    public static void sortOfSort(int[] arr) {
        sortOfSort(arr, 0, arr.length-1, 0);
    }

    public static void sortOfSort(int[] arr, int l, int r, int x) {
        int a = findLargest(arr, l, r);

        if (r > l) {
            if (x == 0) {
                swap(arr, r, a);
                sortOfSort(arr, l, r-1,1);
            }
            else if (x == 1) {
                swap(arr, r,a);
                sortOfSort(arr, l, r-1, 2);
            }
            else if (x == 2) {
                swap(arr,l,a);
                sortOfSort(arr,l+1,r,3);
            }
            else if (x == 3) {
                swap(arr,l,a);
                sortOfSort(arr, l+1,r,0);
            }
        }
    }

    public static int findLargest(int[] arr, int l, int r) {
        int indexLargest = l;

        for (int i = l; i <= r; i++) {
            if (arr[i] > arr[indexLargest])
                indexLargest = i;
        }

        return indexLargest;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
