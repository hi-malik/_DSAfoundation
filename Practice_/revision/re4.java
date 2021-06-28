package revision;

import java.io.*;
import java.util.*;

public class re4 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int faith = factorial(n - 1);
        int myAns = faith * n;
        return myAns;
    }

}