import java.util.Scanner;

public class single {
    // public static int find_single(int arr[]) {
    // int n = arr.length;
    // if (n == 1) {
    // return arr[0];
    // }
    // for (int i = 0; i < n; i++) {
    // if (i == 0) {
    // if (arr[i] != arr[i + 1])
    // return arr[i];
    // } else if (i == n - 1) {
    // if (arr[i] != arr[i - 1])
    // return arr[i];
    // } else {
    // if ((arr[i] != arr[i + 1]) && (arr[i] != arr[i - 1]))
    // return arr[i];
    // }
    // }
    // return -1;
    // }
    // public static int xor_find_single(int arr[]) {
    // int n = arr.length;
    // int ans = 0;
    // for (int i = 0; i < n; i++) {
    // ans = ans ^ arr[i];
    // }
    // return ans;
    // }
    public static int binary_search_single(int arr[]) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((arr[mid] != arr[mid - 1]) && (arr[mid] != arr[mid + 1])) {
                return arr[mid];
            } else if (((mid % 2) == 1 && arr[mid - 1] == arr[mid]) || ((mid % 2) == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans = find_single(arr);
        // int ans = xor_find_single(arr);
        int ans = binary_search_single(arr);
        System.out.println(ans);
        sc.close();
    }
}
