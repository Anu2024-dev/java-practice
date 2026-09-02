import java.util.*;

public class twosum {
    public static boolean twosumfunc(int arr[], int target) {
        // int ans[] = new int[2];
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (arr[i] + arr[j] == target) {
        // ans[0] = i;
        // ans[1] = j;
        // return ans;
        // }
        // }
        // }
        // return new int[] { -1, -1 };
        // optimized with hashmap
        // int n = arr.length;
        // Map<Integer, Integer> mp = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // int sum = arr[i];
        // int rem = target - sum;
        // if (mp.containsKey(rem)) {
        // return new int[] { mp.get(rem), i };
        // }
        // mp.put(arr[i], i);
        // }
        // return new int[] { -1, -1 };
        // two pointer -- for true/false
        int n = arr.length;
        Arrays.sort(arr);
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans[] = twosumfunc(arr, target);
        // System.out.println(ans[0] + " " + ans[1]);
        if (twosumfunc(arr, target)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
