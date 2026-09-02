import java.util.*;

public class set {
    // public static ArrayList<Integer> union_ele(int a[], int b[]) {
    // Set<Integer> st = new HashSet<>();
    // for (int it : a) {
    // st.add(it);
    // }
    // for (int it : b) {
    // st.add(it);
    // }
    // ArrayList<Integer> arr = new ArrayList<>();

    // for (int num : st) {
    // arr.add(num);

    // }
    // return arr;
    // }
    public static ArrayList<Integer> union_2_pointr(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);

                }
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);

                }
                j++;
            }
        }
        while (i < n) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);

            }
            i++;
        }
        while (j < m) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);

            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        // ArrayList<Integer> ans = union_ele(a, b);
        ArrayList<Integer> ans = union_2_pointr(a, b);
        for (int it : ans) {
            System.out.print(it + " ");
        }
        sc.close();
    }

}
