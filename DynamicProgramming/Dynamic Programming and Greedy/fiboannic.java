import java.io.*;
import java.util.*;

public class fiboannic {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int qb[] = new int[n + 1];
    // int ans = FibM(n, qb);
    // int ans = FibT(n, qb);
    int ans = FibR(n);
    System.out.println(ans);
  }
  // Solved By Using Reccurssion
  public static int FibR(int n){
      if( n== 0 || n== 1 ){
          return n;
      }
      int fib1 = FibR(n - 1);
      int fib2 = FibR(n - 2);
      int fib = fib1 + fib2;

      return fib;
  }
  // Solved By Using Memorization
  public static int FibM(int n, int qb[]) {
    if ( n == 0 || n == 1 ) {
      return n;
    }
    if ( qb[n] != 0) {
      return qb[n];
    }
    int total = 0;
    if (n - 1 >= 0) {
      total += FibM(n - 1, qb);
    }
    if (n - 2 >= 0) {
      total += FibM(n - 2, qb);
    }

    qb[n] = total;
    return total;
  }
  // Solved By Using Tabulation
  public static int FibT(int n, int qb[]) {
    for (int i = 0; i <= n; i++) {
      if ( i == 0 || i == 1 ) {
        qb[i] = i;
        continue;
      }
      int total = 0;

      if (i - 1 >= 0) {
        total += qb[i - 1];
      }
      if (i - 2 >= 0) {
        total += qb[i - 2];
      }

      qb[i] = total;
      continue;
    }
    return qb[n];
  }

}