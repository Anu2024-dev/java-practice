import java.util.*;

public class pyq {
    public static int prior_find(int[] arr) {
        int cnt = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
                cnt++;
            }
        }
        return cnt;
    }

    // public static void moves_zero(int[] arr) {
    // // step-1 temp->non zero store
    // ArrayList<Integer> temp = new ArrayList<>();
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != 0) {
    // temp.add(arr[i]);
    // }
    // }
    // // step-2 temp->move->arr
    // for (int i = 0; i < temp.size(); i++) {
    // arr[i] = temp.get(i);
    // }
    // // step-3-> remainig 0 add
    // for (int i = temp.size(); i < arr.length; i++) {
    // arr[i] = 0;
    // }
    // }
    // public static void moves_zero_optimal(int[] arr) {
    // // first j->non zero
    // int j = -1;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // j = i;
    // break;
    // }
    // }
    // // 2nd
    // if (j != -1) {
    // for (int i = j + 1; i < arr.length; i++) {
    // if (arr[i] != 0) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // j++;
    // }
    // }
    // }
    // }
    // public static boolean is_sorted_arr(int[] arr) {
    // int n = arr.length;
    // for (int i = 0; i < n - 1; i++) {
    // if (arr[i] > arr[i + 1]) {
    // return false;
    // }
    // }
    // return true;
    // }
    public static int missing_ele(int[] arr) {
        int ele = arr.length + 1;
        for (int i = 1; i <= ele; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j])
                    flag = true;
            }

            if (flag == false) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        // int ans = prior_find(arr);
        // System.out.println(ans);
        // moves_zero(arr);
        // moves_zero_optimal(arr);
        // for (int it : arr) {
        // System.out.print(it + " ");
        // }
        // boolean ans = is_sorted_arr(arr);
        int ans = missing_ele(arr);
        System.out.println(ans);
        sc.close();
    }

}