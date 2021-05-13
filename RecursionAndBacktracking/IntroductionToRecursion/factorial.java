import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = fact(n);
        System.out.println(f);
    }

    public static int fact(int n){
        
        if( n == 0 ){
            return 1;
        }
        int faith = fact( n - 1 );
        int myAns = faith * n;
        return myAns;
    }

}