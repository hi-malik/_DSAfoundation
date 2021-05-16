import java.util.*;
   
   public class reverseAnumber{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int count = 0;
     while(n > 0){
         int digit = n % 10;
         System.out.println(digit);
         n = n / 10;
         
         count++;
     }
    }
   }