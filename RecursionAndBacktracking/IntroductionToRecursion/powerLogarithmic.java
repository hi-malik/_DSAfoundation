import java.io.*;
import java.util.*;

public class powerLogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int log = power(x, n);
        System.out.println(log);
        
    }

    public static int power(int x, int n){
        
        if( n == 0 ){
            return 1;
        }
        int lg = n/2;
        int faith = power(x, lg);
        int logOfx = faith * faith;
        
        if( n % 2 == 1){
            logOfx = logOfx * x;
        }
        return logOfx;
    }

}