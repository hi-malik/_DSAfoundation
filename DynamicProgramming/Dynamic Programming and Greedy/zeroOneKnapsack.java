import java.io.*;
import java.util.*;

public class zeroOneKnapsack {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int vals[] = new int[n];
    int wts[] = new int[n];
    for(int i = 0; i < n; i++){
        vals[i] = scn.nextInt();
    }
    for(int i = 0; i < n; i++){
        wts[i] = scn.nextInt();
    }
    
    int cap = scn.nextInt(); // Capacity
    int qb[][] = new int[n+1][cap+1]; // storage
    for(int i = 1; i < qb.length; i++){ // row 1st se start krnege
        for(int j = 1; j < qb[0].length; j++){ // volumn ko 1st se strat karenge
            if(j >= wts[i - 1]){ // when included
                int rcap = j - wts[i - 1];
                if(qb[i - 1][rcap] + vals[i-1] > qb[i-1][j]){ // when include is great then exclude
                    qb[i][j] = qb[i-1][rcap] + vals[i-1];
                }
                else{
                    qb[i][j] = qb[i-1][j]; // when excluded
                }
            }
            else{
                qb[i][j] = qb[i-1][j]; // when excluded
            }
        }
    }
    System.out.println(qb[n][cap]);
  }
}