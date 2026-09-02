import java.util.*;

public class moores_voting {
    public static int moores_voting_algo(int[] arr) {
        int n = arr.length;
        int count = 0;
        // brute force--->>
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        // using hashmap----->>>>>>
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        // if (entry.getValue() > n / 2) {
        // return entry.getKey();
        // }
        // }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizze of arr:");
        int n = sc.nextInt();
        System.out.println("Enter the values of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = moores_voting_algo(arr);
        System.out.println(ans);
        sc.close();
    }
}
