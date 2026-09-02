import java.util.*;

public class merge {
    public static void swapmerge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);// recurssion
            mergeSort(arr, mid + 1, r);// recursion
            swapmerge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 11, 25, 23, 54, 12 };
        mergeSort(arr, 0, (arr.length) - 1);
        System.out.println(Arrays.toString(arr));
    }
}
