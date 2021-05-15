import java.util.*;

public class patternType16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int spaces = 2 * n - 3;
        int stars = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                stars--;
                val--;
            }
            for (int j = 1; j <= stars; j++) {
                val--;
                System.out.print(val + "\t");

            }
            stars++;
            spaces -= 2;
            System.out.println();
        }

    }
}