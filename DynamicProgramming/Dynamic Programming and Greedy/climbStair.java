import java.io.*;
import java.util.*;

public class climbStair {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int qb[] = new int[n + 1];
        // int climb = climbR(n);
        // int climb = climbM(n, qb);
        int climb = climbT(n, qb);
        System.out.println(climb);
    }
    // By Recursion
    public static int climbR(int n){
        if(n==0){
            return 1;
        }
        int total = 0;
        if(n-1 >= 0){
            total += climbR(n-1);
        }
        if(n-2 >= 0){
            total += climbR(n-2);
        }
        if(n-3 >= 0){
            total += climbR(n-3);
        }
        
        return total;
    }
    // By Memotization
    public static int climbM(int n, int qb[]){
        if(n == 0){
            qb[n] = 1;
            return 1;
        }
        if(qb[n] != 0){
            return qb[n];
        }
        int total = 0;
        if(n-1>=0){
            total+=climbM(n-1, qb);
        }
        if(n-2>=0){
            total+=climbM(n-2, qb);
        }
        if(n-3>=0){
            total+=climbM(n-3, qb);
        }
        
        qb[n] = total;
        return total;
    }
    // By Tabulation
    public static int climbT(int n, int qb[]){
        for(int i = 0; i <= n; i++){
            if( i == 0 ){
                qb[i] = 1;
                continue;
            }
            int total = 0;
            if(i-1>=0){
                total+=qb[i-1];
            }
            if(i-2>=0){
                total+=qb[i-2];
            }
            if(i-3>=0){
                total+=qb[i-3];
            }
            qb[i] = total;
        }
        return qb[n];
    }

}