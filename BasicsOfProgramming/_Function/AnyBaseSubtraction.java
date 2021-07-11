import java.util.*;

public class AnyBaseSubtraction {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int d = getDifference(b, n1, n2);
    System.out.println(d);
  }
  public static int getDifference(int b, int n1, int n2) {
    int rv = 0;
    int p = 1;
    int c = 0;
    while ( n2 > 0 ) // we only need to run till minuend doesnt become zero
      //we know minuend is greater than subtrahend
    {
      int d1 = n1 % 10; //rightmost digit extraction
      int d2 = n2 % 10;
      d2 += c; //settling previous carries (or borrow)
      int d = 0;
      if ( d2 >= d1) //if minuend greater than subtrahend
      {
        c = 0;
        d = d2 - d1;
      }
      else // minuend less than subtrahend
      {
        c = -1; // set carry = -1 to be settled in next iteration
        d = d2 + b - d1; // add base
      }
      rv += d * p;
      p *= 10;
      n1 /= 10;
      n2 /= 10;
    }
    return rv;
  }
}