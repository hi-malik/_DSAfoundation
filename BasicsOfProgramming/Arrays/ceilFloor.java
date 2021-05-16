import java.io.*;
import java.util.*;

public class ceilFloor{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }

    int d = scn.nextInt();

    int left = 0;
    int right = arr.length - 1;

    int floor = 0;
    int ceil = 0;

    while(left<=right){
        int mid = (left + right) / 2;
        if(arr[mid]>d){
            left = mid + 1;
            floor = arr[mid];
        }
        else if(arr[mid]>d){
            right = mid - 1;
            ceil = arr[mid];
        }
        else{
            floor = arr[mid];
            ceil = arr[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}