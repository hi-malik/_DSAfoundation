import java.io.*;
import java.util.*;

public class countBinaryStrings{

public static void main(String[] args) throws Exception {
    // write your code here
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // // One way solving by array
    // int qb0[] = new int[n+1];
    // int qb1[] = new int[n+1];
    
    // qb0[1] = 1;
    // qb1[1] = 1;
    
    // for(int i = 2; i <= n; i++){
    //     qb1[i] = qb1[i-1] + qb0[i-1]; // 1 ke lye aage 0 add and piche 1 add
    //     qb0[i] = qb1[i-1]; // 0 ke lye piche 0 add kar do 
    // }
    // System.out.println(qb1[n] + qb0[n]);
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // One way solving by array
    int oc0 = 1;
    int oc1 = 1;
    
    for(int i = 2; i <= n; i++){
        int nc0 = oc1;
        int nc1 = oc0 + oc1;
        
        oc1 = nc1;
        oc0 = nc0;
    }
    System.out.println(oc0 + oc1);
 }

}