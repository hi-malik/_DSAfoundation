import java.io.*;
import java.util.*;

public class spanOfArray{
    public static void main(String [] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        // initalizing the maximum number
        int maxi = arr[0];

        for(int i = 1; i < n; i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }

        // initalizing the minimum number
        int mini = arr[0];

        for(int i = 0; i < n; i++){
            if(mini > arr[i]){
                mini = arr[i];
            }
        }

        System.out.println(maxi - mini);

    }
} 