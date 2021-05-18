import java.io.*;
import java.util.*;

public class findFirstAndLastPositionOfElementInSortedArray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = scn.nextInt();
    }
    int data = scn.nextInt();

    int left = 0;
    int right = arr.length - 1;
    int fi = -1;
    while(left <= right){
       int mid = (left + right) / 2;
       if(data > arr[mid]){
         left = mid + 1;
       } else if(data < arr[mid]){
         right = mid - 1;
       } else  {
          fi = mid;
          right = mid - 1;
       }
    }

    left = 0;
    right = arr.length - 1;
    int li = -1;
    while(left <= right){
       int mid = (left + right) / 2;
       if(data > arr[mid]){
         left = mid + 1;
       } else if(data < arr[mid]){
         right = mid - 1;
       } else  {
          li = mid;
          left = mid + 1;
       }
    }

    System.out.print(fi + " "); 
    System.out.print(li + " ");
 }

}
                        
                        