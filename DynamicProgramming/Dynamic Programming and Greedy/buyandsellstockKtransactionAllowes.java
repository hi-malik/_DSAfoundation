import java.io.*;
import java.util.*;

public class buyandsellstockKtransactionAllowes {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        int qb[][] = new int[k + 1][n];
        for(int t = 1; t <= k; t++){ // transaction
            for(int d = 1; d < n; d++){ // days
                int max = qb[t][d - 1];
                for(int pd = 0; pd < d; pd++){ // past day
                    int ptilltm1 = qb[t - 1][pd]; // past till transaction - 1;
                    int ptth = arr[d] - arr[pd]; // past transaction
                    
                    if(ptilltm1 + ptth > max){
                        max = ptilltm1 + ptth;
                    }
                }
                qb[t][d] = max;
            }
        }
        System.out.println(qb[k][n - 1]);
    }

}