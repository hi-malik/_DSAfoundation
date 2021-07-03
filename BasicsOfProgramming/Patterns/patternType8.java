import java.util.*;

public class patternType8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        // for(int i = 1; i <= n; i++){
            // for(int j = 1; j <= n; j++){
                // if( i + j == n + 1 ){
                    // System.out.print("*\t");
                // }
                // else{
                    // System.out.print("\t");
                // }
            // }
            // System.out.println();
        // }
                    //  One more way to solve this
        int spaces = n - 1;
        int stars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
            spaces--;
        }

    }
}