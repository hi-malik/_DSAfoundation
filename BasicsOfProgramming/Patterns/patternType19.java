import java.util.*;

public class patternType19{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            //For 1st Row
            if( i == 1 ){
                if( j == n || j <= n / 2 + 1 ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            //For 2nd and 3rd Row
            else if( i <= n / 2 ){
                if( j == n || j == n / 2 + 1 ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            //For 4th Row
            else if( i == n / 2 + 1 ){
                System.out.print("*\t");
            }
            //For 5th and 6th Row
            else if( i < n ){
                if( j == 1 || j == n / 2 + 1 ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            //For 7th Row
            else{
                if( j == 1 || j >= n / 2 + 1 ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            
            
        }
        System.out.println();
    }

 }
}