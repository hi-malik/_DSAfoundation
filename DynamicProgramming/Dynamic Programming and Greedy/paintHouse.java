import java.io.*;
import java.util.*;

public class paintHouse {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        long qb[][] = new long[n][3];
        
        qb[0][0] = arr[0][0];
        qb[0][1] = arr[0][1];
        qb[0][2] = arr[0][2];
        
        for(int i = 1; i < qb.length; i++){
            qb[i][0] = arr[i][0] + Math.min(qb[i - 1][1], qb[i-1][2]);
            qb[i][1] = arr[i][1] + Math.min(qb[i - 1][0], qb[i-1][2]);
            qb[i][2] = arr[i][2] + Math.min(qb[i - 1][0], qb[i-1][1]);
        }

        long ans = Math.min(qb[n-1][0], Math.min(qb[n-1][1], qb[n-1][2]));

        System.out.println(ans);
    }
}