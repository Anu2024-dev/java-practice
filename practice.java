
//import java.util.ArrayList;
import java.util.*;

public class practice {
    // public static void add_all_digit(int num) {
    // int sum = 0;
    // int last_digit = 0;
    // while (num != 0) {
    // last_digit = num % 10;
    // sum = sum + last_digit;
    // num = num / 10;
    // }
    // System.out.println(sum);
    // }

    // public static void min_max_of_num(int num) {
    // int mini = Integer.MAX_VALUE;
    // int maxi = Integer.MIN_VALUE;
    // while (num != 0) {
    // int last_digit = num % 10;
    // if (last_digit < mini) {
    // mini = last_digit;
    // }
    // if (last_digit > maxi) {
    // maxi = last_digit;
    // }
    // num = num / 10;
    // }
    // System.out.println("maxi" + " " + maxi + "mini" + " " + mini);
    // }
    // public static boolean isPal(int num) {
    // int reverse = 0;
    // int n = num;
    // while (num != 0) {
    // int last_digit = num % 10;
    // reverse = reverse * 10 + last_digit;
    // num = num / 10;
    // }
    // return n == reverse;
    // }
    // public static void divisiors(int num) {
    // ArrayList<Integer> arr = new ArrayList<>();
    // for (int i = 1; i * i <= num; i++) {
    // if (num % i == 0) {
    // arr.add(i);
    // if (i != num / i) { // avoid duplicate for perfect square
    // arr.add(num / i);
    // }
    // }
    // }
    // System.out.println(arr);
    // }
    // public static boolean isPrime(int num) {
    // if (num <= 1) {
    // return false;
    // }
    // for (int i = 2; i < num; i++) {
    // if (num % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void primeFactors(int num) {
    // for (int i = 1; i <= Math.sqrt(num); i++) {
    // if (num % i == 0 && isPrime(i)) {
    // System.out.println(i);
    // if (num / i != i && isPrime(num / i)) {
    // System.out.println(num / i);
    // }
    // }
    // }
    // if (isPrime(num)) {
    // System.out.println(num);
    // }
    // }
    // public static boolean armstrong(int num) {
    // int n = num;
    // int cnt = 0;
    // while (n != 0) {
    // cnt = cnt + 1;
    // n = n / 10;
    // }
    // n = num;
    // int dg = 0;
    // while (n != 0) {
    // int rem = n % 10;
    // dg = dg + (int) Math.pow(rem, cnt);
    // n = n / 10;
    // }
    // return dg == num;
    // }
    // public static boolean Sum_of_prime(int num) {
    // for (int i = 0; i * i < num; i++) {
    // if (isPrime(i) && isPrime(num - i)) {
    // System.out.println(i + " " + (num - i));
    // return true;
    // }
    // }
    // return false;
    // }
    // public static boolean perfect_number(int num) {
    // int sum = 1;
    // for (int i = 2; i * i < num; i++) {
    // if (num % i == 0) {
    // sum = sum + i;
    // if (i != num / i) {
    // sum += num / i;
    // }
    // }
    // }
    // if (num == sum) {
    // return true;
    // }
    // return false;
    // }
    // public static void printAp(int num, int gap, int ele) {
    // ArrayList<Integer> arr = new ArrayList<>();
    // arr.add(num);
    // for (int i = 1; i < ele; i++) {
    // num = num + gap;
    // arr.add(num);
    // }
    // System.out.println(arr);
    // }
    // public static void printGp(int num, int gap, int ele) {
    // ArrayList<Integer> arr = new ArrayList<>();
    // // arr.add(num);
    // // for (int i = 1; i < ele; i++) {
    // // num = num * gap;
    // // arr.add(num);
    // // }
    // // System.out.println(arr);
    // for (int i = 1; i < ele; i++) {
    // int term = (int) (num * Math.pow(gap, i - 1));
    // arr.add(term);
    // }
    // System.out.println(arr);
    // }
    public static void power_of_num(int num, int pow) {
        int ans = 1;
        while (pow != 0) {
            if (pow % 2 != 0) {
                pow = pow - 1;
                ans = ans * num;
            } else {
                num = num * num;
                pow = pow / 2;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // add_all_digit(num);
        // min_max_o_num(num);
        // boolean ans = isPal(num);
        // System.out.println(ans);
        // divisiors(num);
        // boolean ans = isPrime(num);
        // System.out.println(ans);
        // primeFactors(num);
        // boolean ans = armstrong(num);
        // System.out.println(ans);
        // boolean ans = perfect_number(num);
        // System.out.println(ans);
        // printGp(num, 2, 5);
        power_of_num(num, 8);
        sc.close();
    }
}
