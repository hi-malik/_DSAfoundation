package revision;

import java.io.*;
import java.util.*;

public class re5 {

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
        int faith = power(x, n - 1);
        int myAns = faith * x;
        return myAns;
    }

}