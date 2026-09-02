import java.util.*;

public class longest_prefix {
    public static String longest_prefix_common(String[] arr) {
        StringBuffer ans = new StringBuffer();
        int n = arr.length;
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[n - 1];
        int traverse = Math.min(first.length(), last.length());
        for (int i = 0; i < traverse; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String ans = longest_prefix_common(arr);
        System.out.println(ans);
        sc.close();
    }
}
