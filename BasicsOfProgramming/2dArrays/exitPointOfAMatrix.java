import java.io.*;
import java.util.*;

public class exitPointOfAMatrix {

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

        int i = 0;
        int j = 0;
        int dir = 0;
        while(true){
            //Calculating roation time
            dir = (dir + arr[i][j]) % 4;
            //1 - east
            if(dir == 0){
                j++;
            }
            //2 - south
            else if(dir == 1){
                i++;
            }
            //3 - west
            else if(dir == 2){
                j--;
            }
            //4 - north
            else if(dir == 3){
                i--;
            }

            //to check if it doesn't move out of the 2darray
            if(i < 0){
                i++;
                break;
            }
            else if(j < 0){
                j++;
                break;
            }
            else if(i == n){
                i--;
                break;
            }
            else if(j == m){
                j--;
                break;
            }

        }
        System.out.println(i);
        System.out.println(j);
        

    }

}
