import java.util.*;

public class array {
    // public static int sum(int[] arr) {
    // int sum = 0;
    // for (int i : arr) {
    // sum += i;
    // }
    // System.out.println(sum);
    // return sum;

    // }
    // public static int linear(int[] arr, int k) {
    // int idx = -1;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == k) {
    // System.out.println(i);
    // return i;
    // }
    // }

    // return idx;
    // }

    // public static int binary(int[] arr, int k) {
    // int s = 0;
    // int e = arr.length - 1;
    // while (s <= e) {
    // int mid = s + (e - s) / 2;
    // if (arr[mid] == k) {
    // return mid;
    // } else if (arr[mid] < k) {
    // s = mid + 1;
    // } else {
    // e = mid - 1;
    // }

    // }
    // return -1;
    // }

    // public static int largest(int[] arr) {
    // // int large = Integer.MIN_VALUE;
    // // for (int i : arr) {
    // // // if (large < i) {
    // // // large = i;
    // // // }
    // // large = Math.max(large, i);

    // // }
    // // System.out.println(large);
    // // return -1;
    // Arrays.sort(arr);
    // int n = arr.length;
    // return arr[n - 1];

    // }

    // public static int second_largest(int[] arr) {
    // Arrays.sort(arr);
    // int n = arr.length;
    // int largest = arr[n - 1];
    // int sec_lrg = -1;
    // for (int i = n - 2; i > 0; i--) {
    // if (largest != arr[i]) {
    // sec_lrg = arr[i];
    // break;
    // }
    // }
    // return sec_lrg;
    // }
    // public static void one_left_roted(int[] arr) {
    // int n = arr.length;
    // int temp = arr[0];
    // for (int i = 1; i < n; i++) {
    // arr[i - 1] = arr[i];
    // }
    // arr[n - 1] = temp;
    // }
    // public static void rotate_by_k(int[] arr, int k) {
    // int n = arr.length;
    // k = k % n;
    // int[] temp = new int[k];
    // for (int i = 0; i < k; i++) {
    // temp[i] = arr[i];
    // }
    // for (int i = k; i < n; i++) {
    // arr[i - k] = arr[i];
    // }
    // int j = 0;
    // for (int i = n - k; i < n; i++) {
    // arr[i] = temp[j];
    // j++;
    // }
    // }

    // public static void reverse(int[] arr, int l, int r) {
    // while (l < r) {
    // int temp = arr[l];
    // arr[l] = arr[r];
    // arr[r] = temp;
    // l++;
    // r--;
    // }
    // }

    // public static void roted_right_arr(int[] arr, int k) {
    // int n = arr.length;
    // k = k % n;
    // reverse(arr, 0, n - k - 1);
    // reverse(arr, n - k, n - 1);
    // reverse(arr, 0, n - 1);
    // }

    // public static void roted_arr_d(int[] arr, int k) {
    // int n = arr.length;
    // k = k % n;
    // reverse(arr, 0, k - 1);
    // reverse(arr, k, n - 1);
    // reverse(arr, 0, n - 1);
    // }

    // public static void reverse_arr(int[] arr) {
    // int n = arr.length;
    // int l = 0;
    // int r = n - 1;
    // while (l < r) {
    // int temp = arr[l];
    // arr[l] = arr[r];
    // arr[r] = temp;
    // r--;
    // l++;
    // }
    // }
    public static ArrayList<Integer>fun(int[] arr, int k) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                ar.add(arr[i]);
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // int a = sc.nextInt();
        // arr[i] = a;
        // }
        // for (int i : arr) {
        // System.err.print(i + " ");
        // }
        // String input = sc.nextLine();
        // if (input.startsWith("{") && input.endsWith("}")) {
        // input = input.substring(1, input.length() - 1);
        // }
        // String b[] = input.split(",");
        // ArrayList<Integer> ar = new ArrayList<>();
        // for (String token : b) {
        // int num = Integer.parseInt(token);
        // ar.add(num);
        // }
        // for (int i : ar) {
        // System.err.print(i + " ");
        // }
        // sum(arr);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int k = sc.nextInt();
        // int k = sc.nextInt();
        // linear(arr, k);
        // int ans = binary(arr, k);
        // System.out.println(ans);
        // largest(arr);
        // int ans = second_largest(arr);
        // System.out.println(ans);
        // reverse_arr(arr);
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // one_left_roted(arr);
        // rotate_by_k(arr, k);
        // roted_arr_d(arr, k);
        // roted_right_arr(arr, k);
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        ArrayList<Integer> ans = fun(arr, k);
        System.out.println(ans);
        sc.close();
    }
}
