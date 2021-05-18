import java.io.*;
import java.util.*;

public class Solution{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }
    
    //Now calcuate the maxi value
    int maxi = arr[0];
    for(int i = 1; i < n; i++){
        if(maxi < arr[i]){
            maxi = arr[i];
        }
    }
    
    //Now make the *
    for(int floor = maxi; floor >= 1; floor--){
        for(int i = 0; i < n; i++){
            if(arr[i] >= floor){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}