import java.io.*;
import java.util.*;

public class targetSumSubsets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int tar = scn.nextInt(); // Target lelo
        boolean qb[][] = new boolean[n+1][tar+1]; // storage
        for(int i = 0; i < qb.length; i++){
            for(int j = 0; j < qb[0].length; j++){
                //1st element
                if(i == 0 && j == 0){
                    qb[i][j] = true;
                }
                //1st row ke lye
                else if(i == 0){
                    qb[i][j] = false;
                }
                //1st column ke lye
                else if(j == 0){
                    qb[i][j] = true;
                }
                else{
                    //jab include nahi hn
                    if(qb[i-1][j] == true){
                        qb[i][j] = true;
                    }
                    // jab include hn
                    else{
                        int val = arr[i-1]; // beacuse qb and arr ka index same nahi hn i = i-1 hn
                        if(j >= val){
                            if(qb[i-1][j-val] == true){
                                qb[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(qb[arr.length][tar]);
    }
}