import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
    }
}