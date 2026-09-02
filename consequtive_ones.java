import java.util.*;

public class consequtive_ones {
    public static int count_one(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                maxi = Math.max(count, maxi);
            } else {
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = count_one(arr);
        System.out.print(ans);
        sc.close();
    }
}
