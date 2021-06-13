import java.io.*;
import java.util.*;

public class partitionIntoSubstes {
        
    public static long partitionKSubset(int n, int k) {
        // write your code here
        long qb[][] = new long[k+1][n+1];
        for(int t = 1; t <= k; t++){
            for(int p = 1; p <= n; p++){
                if(p < t){
                    qb[t][p] = 0;
                }
                else if(p == t){
                    qb[t][p] = 1;
                }
                else{
                    qb[t][p] = qb[t-1][p-1] + qb[t][p-1] * t;
                }
            }
        }
        return qb[k][n];
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}