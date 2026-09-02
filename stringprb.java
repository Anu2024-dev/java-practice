import java.util.*;

class stringprb {
    // public static String largestOddNum(String s) {
    // int inx = -1;
    // for (int i = s.length() - 1; i >= 0; i--) {
    // if ((s.charAt(i) - '0') % 2 == 1) {
    // inx = i;
    // break;
    // }
    // }
    // if (inx == -1) {
    // return "";
    // }
    // int j = 0;
    // while (j <= inx && s.charAt(j) == '0') {
    // j++;
    // }
    // return s.substring(j, inx + 1);
    // }
    // public static String reverse(String s) {
    // // char arr[] = s.toCharArray();
    // // int i = 0;
    // // int j = s.length() - 1;
    // // while (i < j) {
    // // char temp = arr[i];
    // // arr[i] = arr[j];
    // // arr[j] = temp;
    // // i++;
    // // j--;
    // // }
    // // String reverse = new String(arr);
    // // return reverse;
    // StringBuilder reversed = new StringBuilder(s);
    // String ans = reversed.reverse().toString();
    // return ans;
    // }
    public static boolean is_pal(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String ans = largestOddNum(s);
        // String ans = reverse(s);
        // System.out.println(ans);
        boolean ans = is_pal(s);
        if (ans) {
            System.out.println("yes pal");
        } else {
            System.out.println("not pal");
        }
        sc.close();
    }
}