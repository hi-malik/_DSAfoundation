import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank_14pattern8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val=1;
        int nsp=n-1;
        int nst=1;

        for(int r=0;r<n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            int cval=val;
            for(int cst=1;cst<=nst;cst++){
                System.out.print(cval + " ");
                if(cst<=nst/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            System.out.println();
            nsp--;
            nst+=2;
            val++;
        }
    }
}