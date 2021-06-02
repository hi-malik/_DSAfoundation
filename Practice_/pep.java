import java.io.*;
import java.util.*;

public class pep {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int jumpList[] = new int[n];
        for (int i = 0; i <= n; i++) {
            jumpList[i] = scn.nextInt();
        }
        // Storage
        int qb[] = new int[n + 1];
        qb[n] = 1; // Last wale ka pauchne ke sirf 1 raste hn
        for (int i = n - 1; i >= 0; i--) {
            int totalways = 0;
            for (int jump = 1; jump <= jumpList[i] && i + jump <= n; jump++) {
                totalways += qb[i + jump];
            }
            qb[i] = totalways;
        }
        System.out.println(qb[0]);
    }

}