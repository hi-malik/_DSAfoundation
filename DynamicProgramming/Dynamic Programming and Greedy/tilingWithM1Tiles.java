import java.io.*;
import java.util.*;

public class tilingWithM1Tiles {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int qb[] = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            if(i < m){
                qb[i] = 1;
            }
            else if(i == m){
                qb[i] = 2;
            }
            else{
                qb[i] = qb[i - 1] + qb[i - m];
            }
        }
        System.out.println(qb[n]);
    }
}