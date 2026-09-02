import java.util.*;

class map {
    public static int largest_subarray_with_sum_k(int[] arr, int k) {
        // int len = 0;
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        // int sum = 0;
        // for (int j = i; j < n; j++) {
        // sum = sum + arr[j];
        // if (sum == k) {
        // len = Math.max(len, (j - i + 1));
        // }
        // }
        // }
        // return len;
        // optimized;
        // Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        // int psum = 0;
        // int n = arr.length;
        // int maxlen = 0;
        // for (int i = 0; i < n; i++) {
        // psum += arr[i];
        // if (psum == k) {
        // maxlen = Math.max(maxlen, i + 1);
        // }
        // int rem = psum - k;
        // if (mp.containsKey(rem)) {
        // int len = i - mp.get(rem);
        // maxlen = Math.max(maxlen, len);
        // }
        // if (!mp.containsKey(rem)) {
        // mp.put(psum, i);
        // }
        // }
        // return maxlen;
        // only for positive nbumber with two pointer;
        int n = arr.length;
        int maxlen = 0;
        int l = 0;
        int r = 0;
        int sum = arr[l];
        while (r < n) {
            while (l <= r && sum > k) {
                sum = sum - arr[l];
                l++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
            if (r < n) {
                sum += arr[r];
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = largest_subarray_with_sum_k(arr, k);
        System.out.println(ans);
        sc.close();
    }
}
