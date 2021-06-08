import java.io.*;
import java.util.*;

public class climbstairwithminimum {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        Integer qb[] = new Integer[n + 1];
        qb[n] = 0;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int j = 1; j <= arr[i] && i + j < qb.length; j++){
                    if(qb[i+j] != null){
                        min = Math.min(min, qb[i+j]);
                    }
                }
                if(min != Integer.MAX_VALUE){
                    qb[i] = min + 1;
                }
            }
        }
        System.out.println(qb[0]);
    }

}