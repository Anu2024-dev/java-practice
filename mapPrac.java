import java.util.*;

public class mapPrac {
    // public static int freq_count(int[] arr) {
    // HashMap<Integer, Integer> mp = new HashMap<>();
    // for (int i = 0; i < arr.length; i++) {
    // mp.put(i, mp.getOrDefault(arr[i], 0) + 1);
    // }
    // int maxfreq = 0;
    // int total = 0;
    // for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
    // int newFreq = entry.getValue();
    // if (maxfreq < newFreq) {
    // maxfreq = newFreq;
    // total = newFreq;
    // } else if (maxfreq == newFreq) {
    // total += newFreq;
    // }
    // }
    // return total;

    // }
    public static int longest_subarrays_with_sum_k(int[] arr, int k) {
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans = freq_count(arr);

        int ans = longest_subarrays_with_sum_k(arr, k);
        System.out.println(ans);
        sc.close();
    }
}
