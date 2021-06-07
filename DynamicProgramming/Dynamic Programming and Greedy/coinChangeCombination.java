import java.io.*;
import java.util.*;

public class coinChangeCombination {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int amt = scn.nextInt(); // Amount means = sum
        int qb[] = new int[amt+1];
        qb[0] = 1; // oth index pe 1 by default
        for(int i = 0; i < arr.length; i++){ // phale coin ka loop
            for(int j = arr[i]; j < qb.length; j++){ // fir one by one karke  amt nikal lenge
                qb[j] += qb[j - arr[i]];
            }
        }
        
        System.out.println(qb[amt]);
    }
}