import java.util.*;

public class patternType11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int a = 1;
        // int a = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                
                System.out.print( a + "\t");
                // int sum = a + a;
                // a = sum;
                // b = sum;
                a++;
            }
            System.out.println();
        }

    }
}