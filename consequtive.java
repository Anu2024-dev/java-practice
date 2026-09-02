import java.util.*;

public class consequtive {
    public static void count_consequtive(String arr) {
        long M = 100000007;
        long res = 0;
        long count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '1') {
                count++;
                res = (res + count) % M;
            } else {
                // res = (res + (count * (count + 1)) / 2) % M;
                count = 0;
            }
        }
        // if (count != 0) {
        // res = (res + (count * (count + 1)) / 2) % M;
        // }
        System.out.println((int) res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        count_consequtive(arr);
        sc.close();

    }
}
