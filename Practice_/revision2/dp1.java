package revision2;

import java.io.*;
import java.util.*;

public class dp1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n + 1];
        int cs = climbStairs(n,dp);
        System.out.println(cs);
    }
    
    public static int climbStairs(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        
        int total = 0;
        
        if(n - 1 >= 0){
            total += climbStairs(n - 1, dp);
        }
        if(n - 2 >= 0){
            total += climbStairs(n - 2, dp);
        }
        if(n - 3 >= 0){
            total += climbStairs(n - 3, dp);
        }
        
        dp[n] = total;
        return total;
    }

}