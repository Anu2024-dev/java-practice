import java.util.*;

public class morphic {
    public static boolean is_isomorphic(String s, String t) {
        int sMap[] = new int[256];
        int tMap[] = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (sMap[s.charAt(i)] != tMap[t.charAt(i)]) {
                return false;
            }
            sMap[s.charAt(i)] = i + 1;
            tMap[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans = is_isomorphic(s, t);
        if (ans) {
            System.out.println("yes isomorphic");
        } else {
            System.out.println("not isomorphic");
        }
        sc.close();
    }
}
