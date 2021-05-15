import java.util.*;

public class patternType18{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
     int n =scn.nextInt();
     int spaces = 0;
     int stars = n;
    //  int arr[] = new int[n];
     for(int i = 1; i <= n; i++){
         for(int j = 1; j <= spaces; j++){
             System.out.print("\t");
         }
         for(int j = 1; j <= stars; j++){
             if( i > 1 && i<= n/2 && j > 1 && j < stars ){
                 System.out.print("\t");
             }
             else{
                 System.out.print("*\t");
             }
         }
         
         if( i <= n/2){
             spaces++;
             stars-=2;
         }else{
             spaces--;
             stars+=2;
         }
         System.out.println();
     }

 }
}