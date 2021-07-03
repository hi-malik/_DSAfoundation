import java.util.*;

public class patternType7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        // int n = scn.nextInt();
        // 
        // for(int i = 1; i <= n; i++){
            // for(int j = 1; j <= i; j++){
                // if( j == i ){
                    // System.out.print("*\t");
                // }else{
                    // System.out.print("\t");
                // }
            // }
            // System.out.println();
        // }
        int n = scn.nextInt();
        int stars = 1;
        int spaces = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            System.out.println();
            spaces++;
        }

    }
}