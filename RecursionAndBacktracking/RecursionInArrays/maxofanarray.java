import java.io.*;
import java.util.*;

public class maxofanarray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length){
            return idx;
        }
        int faith = maxOfArray(arr, idx + 1);
        if(faith > arr[idx]){
            return faith;
        }
        else{
            return arr[idx];
        }
    }

}