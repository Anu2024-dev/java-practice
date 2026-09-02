import java.util.Scanner;

public class dutch {
    // public static void sort_ar(int[] arr) {
    // int zero = 0;
    // int one = 0;
    // int two = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0)
    // zero++;
    // else if (arr[i] == 1)
    // one++;
    // else if (arr[i] == 2)
    // two++;
    // }
    // for (int i = 0; i < zero; i++) {
    // arr[i] = 0;
    // }
    // for (int i = zero; i < zero + one; i++) {
    // arr[i] = 1;
    // }
    // for (int i = zero + one; i < arr.length; i++) {
    // arr[i] = 2;
    // }
    // }
    public static void dutch_algo(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // sort_ar(arr);
        dutch_algo(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
        sc.close();
    }
}
