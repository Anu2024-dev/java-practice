package PRBLMGOI;

import java.util.*;

// public class BinaryGap {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// String binary = "";
// while (n > 0) {
// binary = (n % 2) + binary;
// n = n / 2;
// }
// int count = 0;
// int maxgap = 0;
// boolean findOne = false;
// for (int i = 0; i < binary.length(); i++) {
// if (binary.charAt(i) == '1') {
// if (findOne) {
// maxgap = Math.max(maxgap, count);
// }
// findOne = true;
// count = 0;
// } else if (findOne) {
// count++;

// }
// }
// System.out.println("gap" + maxgap);

// sc.close();
// }
// }
// ********0(1)******* */
public class BinaryGap {
    public static int printGap(int n) {
        int count = 0;
        int maxgap = 0;
        boolean findOne = false;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (findOne) {
                    maxgap = Math.max(maxgap, count);

                }
                findOne = true;
                count = 0;
            } else if (findOne) {
                count++;
            }
            n = n >> 1;
        }
        return maxgap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printGap(n));
    }
}