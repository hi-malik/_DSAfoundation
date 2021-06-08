import java.io.*;
import java.util.*;

public class arrangeBuildings {

  public static void main(String[] args) throws Exception {
    // write your code here
    // We use long instead of int because for long test case like 38-45 it will fail. So, thats the change
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();
    
    long ob = 1L;
    long os = 1L;
    
    for(int i = 2; i <= n; i++){
        long nb = os;
        long ns = os + ob;
        
        os = ns;
        ob = nb;
    }
    long total = (os + ob);
    total = total * total;
    System.out.println(total);
  }

}