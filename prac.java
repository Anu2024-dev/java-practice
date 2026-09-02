import java.util.*;

public class prac {
    // public static void bublesort(int[] arr) {
    // for (int i = 0; i < (arr.length) - 1; i++) {
    // boolean swapped = false;
    // for (int j = 0; j < (arr.length) - i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // swapped = true;
    // }
    // }
    // if (swapped == false)
    // break;
    // 7 8 1 3 2-> 1st step i=0,indx=0
    // }
    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indx]) {
                    indx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indx];
            arr[indx] = temp;

        }
    }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // bublesort(arr);
        selectionsort(arr);
        for (int it : arr) {
            System.out.println(it);
        }
        sc.close();
    }
}
