import java.io.*;
import java.util.*;

public class barChart{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }

    int max = arr[0]; //we declare the maximum value of stars
    for(int i = 1; i < n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }

    // now we have to declare the height of max stars and spaces if no stars
    for(int floor = max; floor>=1; floor--){
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