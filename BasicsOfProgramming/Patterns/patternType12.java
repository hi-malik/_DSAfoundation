import java.util.*;

public class patternType12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }

    }
}