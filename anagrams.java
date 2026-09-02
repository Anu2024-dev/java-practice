import java.util.*;

public class anagrams {
    public static boolean valid_anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        // return Arrays.equals(sArray, tArray);
        int hash[] = new int[26];
        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            hash[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (hash[i] != 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans = valid_anagram(s, t);
        System.out.print(ans);
        sc.close();
    }
}
