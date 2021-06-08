import java.io.*;
import java.util.*;

public class unboundedKnapsack {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int vals[] = new int[n];
    for(int i = 0; i < n; i++){
        vals[i] = scn.nextInt();
    }
    int wats[] = new int[n];
    for(int i = 0; i < n; i++){
        wats[i] = scn.nextInt();
    }
    
    int cap = scn.nextInt();
    int qb[] = new int[cap+1];
    qb[0] = 0;
    for(int c = 0; c <= cap; c++){
        int max = 0;
        for(int i = 0; i < n; i++){
            if(wats[i] <= c){
                int rbagc = c - wats[i]; // capacity
                int rbagv = qb[rbagc]; // value nikal li
                int tbagv = rbagv + vals[i]; // total = bagv + value
                
                if(tbagv > max){
                    max = tbagv;
                }
            }
        }
        qb[c] = max;
    }
    System.out.println(qb[cap]);
  }
}