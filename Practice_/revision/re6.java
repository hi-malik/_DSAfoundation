package revision;

import java.io.*;
import java.util.*;

public class re6 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int pw = power(x, n);
        System.out.println(pw);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int log = n / 2;
        int faith = power(x, log);
        int logOfx = faith * faith;
        if(n % 2 == 1){
            logOfx = logOfx * x;
        }
        return logOfx;
    }

}