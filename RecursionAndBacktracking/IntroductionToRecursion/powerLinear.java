import java.io.*;
import java.util.*;

public class powerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = power(x, n);
        System.out.println(p);
    }

    public static int power(int x, int n){
        
        if( n == 0 ){
            return 1;
        }
        int faith = power(x, n - 1);
        int myAns = faith * x;
        return myAns;
    }

}