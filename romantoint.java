import java.util.*;

public class romantoint {
    public static void romToInt(String s) {
        Map<Character, Integer> d = new HashMap<>();
        d.put('i', 1);
        d.put('v', 5);
        d.put('x', 10);
        d.put('l', 50);
        d.put('c', 100);
        d.put('d', 500);
        d.put('m', 1000);
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n;) {
            if (i < n - 1 && d.get(s.charAt(i)) < d.get(s.charAt(i + 1))) {
                sum = sum + (d.get(s.charAt(i + 1)) - d.get(s.charAt(i)));
                i += 2;
            } else {
                sum = sum + d.get(s.charAt(i));
                i++;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        romToInt(s);
        sc.close();
    }
}
