import java.util.*;

public class inverseOfAnumber{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  
      int op = 1;
      int inv = 0;
      
      while(n>0){
         int od = n % 10;
         int ip = od;
         int id = op;
         
        //  Make change to inv using ip and id
         
         inv = inv + id * (int)Math.pow(10, ip - 1);
         n = n / 10;
         op++;
      }
      
  
    System.out.println(inv);

 }
}