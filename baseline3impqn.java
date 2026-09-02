
//You are given an array of 2*N + 2 numbers.
// This array has N numbers which appear exactly twice in the array and 2 numbers which occur exactly once in the array.
// You have to output these 2 unique numbers in ascending order separated by a space.

// For example –
// If the given array is
// arr = {1,2,2,3,3,4,4,5,6,6}
// then the output should be
// 1 5
// as these are the 2 numbers that are not repeating in the array.
// import java.util.*;

// public class baseline3impqn {
//     public static void find_two_dupli(int[] arr) {
//         int xorall = 0;
//         for (int i = 0; i < arr.length; i++) {
//             xorall = xorall ^ arr[i];
//         }
//         int setbit = xorall & (-xorall);
//         int a = 0;
//         int b = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if ((setbit & arr[i]) != 0) {
//                 a = a ^ arr[i];
//             } else {
//                 b = b ^ arr[i];
//             }
//         }
//         if (a < b) {
//             System.out.print(a + " " + b);
//         } else {
//             System.out.print(b + " " + a);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int size = n * 2 + 2;
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         find_two_dupli(arr);
//         sc.close();
//     }
// }

import java.util.*;

public class baseline3impqn {
    public static void printRepeating(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] % n;
            arr[index] = arr[index] + n;
        }
        boolean firstPrnt = true;
        for (int i = 0; i < n; i++) {
            int freq = arr[i] / n;
            if (freq > 1) {
                if (!firstPrnt)
                    System.out.print(" ");
                System.out.print(i);
                firstPrnt = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printRepeating(arr);
        sc.close();
    }
}