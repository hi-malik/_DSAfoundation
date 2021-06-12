import java.io.*;
import java.util.*;

public class paintHouseManyColor {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        
        int arr[][] = new int[n][c];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int qb[][] = new int[n][c];
        
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        
        for(int j = 0; j < c; j++){
            qb[0][j] = arr[0][j];
            
            if(arr[0][j] <= least){
                sleast = least;
                least = arr[0][j];
            }else if(arr[0][j] <= sleast){
                sleast = arr[0][j];
            }
        }
        
        for(int i = 1; i < qb.length; i++){
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
                
            for(int j = 0; j < qb[0].length; j++){
                if(least == qb[i-1][j]){
                    qb[i][j] = sleast + arr[i][j];
                }
                else{
                    qb[i][j] = least + arr[i][j];
                }
                
                if(qb[i][j] <= nleast){
                    nsleast = nleast;
                    nleast = qb[i][j];
                }
                else if(qb[i][j] <= nsleast){
                    nsleast = qb[i][j];
                }
            }
            least = nleast;
            sleast = nsleast;
        }
        System.out.println(least);
    }
}