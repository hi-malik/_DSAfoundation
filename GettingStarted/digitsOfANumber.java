import java.util.*;

public class digitsOfANumber {
      public static void main(String [] args){
// 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int copy = n;
    int length = 0;
    //Lets calculate the length first
    while(copy!=0){
      copy = copy/10;
      length++;
    }
    //Now digit out the number
// 
    while(length!=0){
      int digit = n/(int)Math.pow(10, length - 1);
      System.out.println(digit);
      n = n % (int)Math.pow(10, length - 1);
      length--;
    }
// 
  }
}