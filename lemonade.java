import java.util.*;

public class lemonade {
    public static boolean lemonade_change(int[] bills) {
        int n = bills.length;
        int five = 0;
        int ten = 0;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers:");
        int n = sc.nextInt();
        System.out.println("Enter the values given by the customers");
        int[] bills = new int[n];
        for (int i = 0; i < n; i++) {
            bills[i] = sc.nextInt();
        }
        if (lemonade_change(bills)) {
            System.out.println("It's possible to distribute lemonade changes to all the customers");
        } else {
            System.out.println("It's not possible to distribute all the changes of lemonades among all the customers.");
        }
        sc.close();

    }
}