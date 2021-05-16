import java.io.*;
import java.util.*;

public class ringRotate {

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

        int s = scn.nextInt(); //which shell want to rotate
        int r = scn.nextInt(); //kitne se rotate krna hn
        rotateShell(arr, s, r);
        diplay(arr);
    }
    public static void rotateShell(int arr[][], int s, int r){
        int oned[] = filledOnedFromShell(arr, s);
        rotate(oned, r);
        filledShellFromOned(arr, s, oned);
    }

    public static void filledOnedFromShell(int arr[][], int s){
        //video leave at 18:50
    }
    public static void filledShellFromOned(int arr[][], int s, int oned[]){

    }

    public static void rotate(int oned[], int r){
        r = r % arr.length;
        if(r < 0){
            r = r + arr.length;
        }

        reverse(oned, 0, oned.length - r -1);
        reverse(oned, 0, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int oned[], int li, int ri){
        while(li < ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}