package PRBLMGOI;

import java.util.*;

public class WaterFlowSimulation {
    public static boolean[] printResult(int[] terrain, int[] fountains) {
        boolean[] floded = new boolean[terrain.length];
        for (int i = 0; i < fountains.length; i++) {
            int searchIndex = fountains[i];
            int heightOfTerrn = terrain[searchIndex];
            for (int j = searchIndex - 1; j >= 0; j--) {
                if (terrain[j] >= heightOfTerrn) {
                    break;
                }
                floded[j] = true;

            }
            for (int j = searchIndex + 1; j < terrain.length; j++) {
                if (terrain[j] >= heightOfTerrn) {
                    break;
                }
                floded[j] = true;
            }
        }
        return floded;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of terrain: ");
        int size = sc.nextInt();
        int[] terrain = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value of terrain: ");
            terrain[i] = sc.nextInt();
        }
        System.out.print("Enter size of fountain: ");
        int size_fnt = sc.nextInt();
        int[] fountains = new int[size_fnt];
        for (int i = 0; i < size_fnt; i++) {
            System.out.print("Enter fountain points : ");
            fountains[i] = sc.nextInt();
        }
        boolean[] ans = printResult(terrain, fountains);
        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < ans.length; i++) {
            if (ans[i]) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        sc.close();
    }
}
