import java.io.*;
import java.util.*;

public class buyandsellstocksInfiniteTransactionAllowed {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int bd = 0; // buy date
        int sd = 0; // sell date
        int profit = 0;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]){
                sd++;
            }
            else{
                profit += arr[sd] - arr[bd];
                bd = sd = i;
            }
        }
        profit += arr[sd] - arr[bd]; // Last mn dip aagya toh usse phale ka bhi profit nikalna hn
        System.out.println(profit);
    }

}
