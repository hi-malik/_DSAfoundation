package revision2;
import java.io.*;
import java.util.*;

public class dp2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int dp[] = new int[n + 1];
        dp[n] = 1;
        for(int i = n - 1; i >= 0; i--){
            int totalways = 0;
            for(int j = 1; j <= arr[i] && i + j <= n; j++){
                totalways += dp[i + j];
            }
            dp[i] = totalways;
        }
        System.out.println(dp[0]);
    }
    

}