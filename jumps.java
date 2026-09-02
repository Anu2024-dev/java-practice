import java.util.*;

public class jumps {
    public static boolean max_jumps(int[] arr) {
        int n = arr.length;
        int maxInt = 0;
        for (int i = 0; i < n; i++) {

            maxInt = Math.max(maxInt, i + arr[i]);
            if (i > maxInt) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers:");
        int n = sc.nextInt();
        System.out.println("Enter the values given by the customers");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (max_jumps(arr)) {
            System.out.println("Lst reached possible");
        } else {
            System.out.println("not possible to reach at last");
        }
        sc.close();

    }
}
