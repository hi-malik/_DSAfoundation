import java.io.*;
import java.util.*;

public class buyandsellstocksTwoTransactionsAllowed {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int lsf = arr[0]; // Least so far
        int mpist = 0; // maximum profit if sold today
        int qbl[] = new int[n]; // dp of maximum profit if sold up to today
        for(int i = 1; i < n; i++){
            if(arr[i] < lsf){
                lsf = arr[i];
            }
            
            mpist = arr[i] - lsf;
            
            if(mpist > qbl[i - 1]){
                qbl[i] = mpist;
            }
            else{
                qbl[i] = qbl[i - 1];
            }
        }
        
        int mpibt = 0; // maximum profit if bought today
        int maxat = arr[arr.length - 1]; // maximum after today
        int qbr[] = new int[n]; // dp of maximum profit if sold after today
        
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > maxat){
                maxat = arr[i];
            }
            
            mpibt = maxat - arr[i];
            
            if(mpibt > qbr[i + 1]){
                qbr[i] = mpibt;
            }
            else{
                qbr[i] = qbr[i + 1];
            }
        }
        
        int op = 0; // Overall profit
        for(int i = 0; i < n; i++){
            if(qbl[i] + qbr[i] > op){
                op = qbl[i] + qbr[i];
            }
        }
        System.out.println(op);
    }

}
