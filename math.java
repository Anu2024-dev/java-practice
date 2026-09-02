import java.util.*;

public class math {
    // public static void add_digit(int num) {
    // int sum = 0;
    // while (num != 0) {
    // int digit = num % 10;
    // sum += digit;
    // num = num / 10;
    // }
    // System.out.print(sum);

    // }
    // public static void factors(int num) {
    // for (int i = 1; i * i < num; i++) {
    // if (num % i == 0) {
    // if (num / i != i) {
    // System.out.print(i + " " + num / i + " ");
    // }
    // }
    // }
    // }

    // public static void prime_factors(int num) {
    // for (int i = 1; i < Math.sqrt(num); i++) {
    // if (num % i == 0 && prime(i)) {
    // System.out.println(i);
    // if (num / i != i && prime(num / i)) {
    // System.out.println(num / i + " ");
    // }
    // }
    // }

    // }

    // public static boolean prime(int num) {
    // if (num <= 1) {
    // return false;
    // } else {
    // for (int i = 2; i < num; i++) {
    // if (num % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
    // }

    // public static void sum_prime(int num) {
    // for (int i = 0; i * i < num; i++) {
    // if (prime(i) && prime(num - i)) {
    // System.out.println("yes" + i + " " + (num - i));
    // }
    // }
    // }
    // public static boolean pal(int num) {
    // int n = num;
    // int rem = 0;
    // int rev = 0;
    // while (num != 0) {
    // rem = num % 10;
    // rev = rev * 10 + rem;
    // num /= 10;

    // }
    // if (rev == n) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    // public static void minmax(int num) {
    // int min = Integer.MAX_VALUE;
    // int max = Integer.MIN_VALUE;
    // while (num != 0) {
    // int rem = num % 10;
    // // min = Math.min(min, rem);
    // // max = Math.max(rem, max);
    // if (rem < min) {
    // min = rem;
    // } else if (rem > max) {
    // max = rem;
    // }
    // num = num / 10;
    // }

    // System.out.print("min" + " " + min + "max" + " " + max);

    // }
    // public static boolean armstrong(int num) {
    // int n = num;
    // int cnt = 0;
    // // int cnt=String.valueOf(num).length();
    // while (n != 0) {
    // cnt++;
    // n /= 10;
    // }
    // n = num;
    // int sum = 0;
    // while (n != 0) {
    // int rem = n % 10;
    // sum += Math.pow(rem, cnt);
    // n = n / 10;
    // }
    // n = num;
    // if (n == sum) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    // public static void sum_AP(int num, int d, int n) {
    // int sum = 0;
    // int term = num;
    // for (int i = 0; i < n; i++) {
    // sum += term;
    // term = term + d;
    // }
    // System.out.println(sum);
    // }
    public static void sum_gp(int num, int d, int n) {
        int temp = num;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + temp;
            temp = temp * d;

        }
        System.out.println(sum);
    }

    public static boolean perfect(int num) {
        int sum = 1;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                sum += i;
                if (num / i != i) {
                    sum += (num / i);
                }
            }
        }
        if (num == sum) {
            return true;
        }
        return false;
    }

    public static void square(int num, int pow) {
        int ans = 1;
        while (pow != 0) {
            if (pow % 2 == 1) {
                ans = ans * num;
                pow--;
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
        // add_digit(num);
        // // minmax(num);
        // if (pal(num)) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }
        // factors(num);
        // if (prime(num)) {
        // System.out.println("prime");
        // } else {
        // System.out.println("not");
        // }
        // prime_factors(num);
        // if (armstrong(num)) {
        // System.out.println("armstrong");
        // } else {
        // System.out.println("no");
        // }
        // sum_prime(num);
        sum_gp(num, 2, 5);
        if (perfect(num)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        square(num, 2);
        sc.close();

    }

}
