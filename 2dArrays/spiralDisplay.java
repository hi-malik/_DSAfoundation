import java.io.*;
import java.util.*;

public class spiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int maxr = arr.length-1;
        int minc = 0;
        int maxc = arr[0].length-1;

        //whenToStop
        int totalNoOfElements = n * m;
        int count = 0;
        while(count < totalNoOfElements){
            //leftWall
            for(int i = minr, j = minc; i <= maxr && count < totalNoOfElements; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //bottomWall
            for(int i = maxr, j = minc; j <= maxc && count < totalNoOfElements; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            //rightWall
            for(int i = maxr, j = maxc; i >= minr && count < totalNoOfElements; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            //topWall
            for(int i = minr, j = maxc; j>= minc && count < totalNoOfElements; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;

        }

    
    }
        

    
}
