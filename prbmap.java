import java.util.*;

public class prbmap {
    public static void freq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int value = mp.getOrDefault(key, 0) + 1;
            mp.put(key, value);
        }
        // for (Map.Entry<Integer, Integer> st : mp.entrySet()) {
        // System.out.print(st.getKey() + "->" + st.getValue());
        // }
        boolean ans = mp.containsKey(2);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        freq(arr);
        sc.close();
    }
}
