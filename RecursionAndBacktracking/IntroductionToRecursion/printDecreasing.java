import java.io.*;
import java.util.*;

public class printDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pd(n);
    }

    public static void pd(int n){

        if( n == 0 ){
            return;
        }
        System.out.println(n);
        pd(n - 1);
           
    }

}