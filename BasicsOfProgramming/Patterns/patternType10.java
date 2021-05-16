import java.util.*;

public class patternType10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     
     int outersp = n/2;
     int innersp = -1;
     
     for(int i = 1; i <= n; i++){
        for(int j = 1; j <= outersp; j++){
            System.out.print("\t");
        }
        System.out.print("*\t");
        for(int j = 1; j <= innersp; j++){
            System.out.print("\t");
        }
        
        if( i > 1 && i < n){
            System.out.print("*\t");
        }
        
        if( i <= n/2 ){
            outersp--;
            innersp+=2;
        }
        else{
            outersp++;
            innersp-=2;
        }
        System.out.println();
     }

 }
}