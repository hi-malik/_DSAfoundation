import java.util.*;

public class patternType4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int spaces = 0;
        int stars = n;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            System.out.println();
            
            spaces++;
            stars--;
        }
    }
}