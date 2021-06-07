import java.io.*;
import java.util.*;

public class goldmine {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int qb[][] = new int[n][m]; // Storage
        for(int j = m - 1; j >= 0; j--){ // Column right se niche ki traf ghumte hue left jayenge
            for(int i = n - 1; i >= 0; i--){
                // last column as it is 
                if(j == m - 1){
                    qb[i][j]= arr[i][j];
                }
                // 1 st row bhi bas 2 mn check karegi
                else if(i == 0){
                    qb[i][j] = Math.max(qb[i][j+1], qb[i+1][j+1]) + arr[i][j];
                }
                // last row bhi bas 2 mn check karegi
                else if( i == n - 1){
                    qb[i][j] = Math.max(qb[i][j+1], qb[i-1][j+1]) + arr[i][j];
                }
                // rest of ke lye
                else{
                    qb[i][j] = Math.max(qb[i+1][j+1], Math.max(qb[i][j+1], qb[i - 1][j+1])) + arr[i][j];
                }
            }
        }
        // Left column mn max find karo
        int max = qb[0][0];
        for(int i = 1; i < n; i++){
            if(qb[i][0] > max){
                max = qb[i][0];
            }
        }
        System.out.println(max);
        
    }

}