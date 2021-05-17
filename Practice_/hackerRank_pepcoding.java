import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRank_pepcoding {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scn = new Scanner(System.in);
        int t = 1;
        for(int i = 0; i < t; i++){
          int n = scn.nextInt();  
          int count = 0;
          for(int div = 2; div*div<=n; div++){
            if( n % div == 0 ){
              count++;
              break;
            }

            if(count == 0){
              System.out.println("Prime");
            }
            else{
              System.out.println("Not Prime");
            }
          }
        }
    }
}