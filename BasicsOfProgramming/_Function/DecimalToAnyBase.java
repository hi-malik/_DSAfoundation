import java.util.*;
  
  public class DecimalToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int pv= 1;
       int rv = 0;
       while(n > 0){
           int digit = n % b;
           rv += (digit * pv);
           pv *= 10;
           n = n / b;
       }
       return rv;
   }
  }