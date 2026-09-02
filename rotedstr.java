import java.util.*;

public class rotedstr {
    public static boolean roted_str(String str, String goal) {
        if (str.length() != goal.length()) {
            return false;
        }
        // for (int i = 0; i < str.length(); i++) {
        // String roted = str.substring(i) + str.substring(0, i);
        // if (roted.equals(goal)) {
        // return true;
        // }
        // }
        String doublestr = str + str;
        return doublestr.contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String goal = sc.nextLine();
        boolean ans = roted_str(str, goal);
        System.out.println(ans);
        sc.close();
    }
}
