import java.io.*;
import java.util.*;

public class buysellstocktransactionfeeInfiniteTransaction {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int fee = scn.nextInt();
        
        int obsp = -arr[0]; // Old bought state profit
        int ossp = 0; // old sell state profit
        
        for(int i = 1; i < arr.length; i++){
            
            int nbsp = 0; // New bought state profit
            int nssp = 0; // New sell state profit
            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }
            else{
                nbsp = obsp;
            }
            
            if(obsp + arr[i] - fee > ossp){
                nssp = obsp + arr[i] - fee;
            }
            else{
                nssp = ossp;
            }
            
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }

}