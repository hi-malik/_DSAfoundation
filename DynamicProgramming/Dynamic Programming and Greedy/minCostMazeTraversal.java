import java.io.*;
import java.util.*;

public class minCostMazeTraversal {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int arr[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int qb[][] = new int[n][m];

    for (int i = n - 1; i >= 0; i--) {
      for (int j = m - 1; j >= 0; j--) {
        // last element(dest)
        if (i == n - 1 && j == m - 1) {
          qb[i][j] = arr[i][j];
        }
        //row ke lye
        else if (i == n - 1) {
          qb[i][j] = qb[i][j + 1] + arr[i][j];
        }
        // column ke lye
        else if (j == m - 1) {
          qb[i][j] = qb[i + 1][j] + arr[i][j];
        }
        // rest of ke lye
        else {
          qb[i][j] = Math.min(qb[i][j + 1], qb[i + 1][j]) + arr[i][j];
        }
      }
    }
    System.out.println(qb[0][0]);
  }

}