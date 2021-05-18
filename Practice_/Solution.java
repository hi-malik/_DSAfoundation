import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2;
        int stars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            System.out.println();
            
            if(i <= n/2){
                spaces--;
                stars +=2;
            }
            else{
                spaces++;
                stars-=2;
            }
        }
    }
}