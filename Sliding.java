import java.util.*;

public class Sliding {
    public static int maxScore(int[] arr, int k) {
        int n = arr.length;
        int max = 0;
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        max = lsum;
        int right = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - arr[i];
            rsum = rsum + arr[right];
            right--;
            max = Math.max(max, lsum + rsum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("chances are given");
        int k = sc.nextInt();
        int ans = maxScore(arr, k);
        System.out.println(ans);
        sc.close();
    }
}