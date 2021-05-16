import java.util.*;
   
   public class rotateAnumber{
   
   public static void main(String[] args) {
       
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int k = scn.nextInt();
       
       int copy = n;
       int length = 0;
       
       while(copy > 0){
           copy = copy / 10;
           length++; 
           //lenght is calculated
       }
       
    //   lets manage k first
        k = k % length;
        if(k < 0){
            k = k + length;
        }
        
        int digit1 = n % (int)Math.pow(10, k);
        int digit2 = n / (int)Math.pow(10, k);
        
        int value = (digit1 * (int)Math.pow(10, length - k)) + digit2;
        
        System.out.println(value);
     
    }
}