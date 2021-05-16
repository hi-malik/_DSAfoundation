import java.util.*;

public class patternType15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int spaces = n / 2;
        int stars = 1;
        int a = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            int ca = a;
            for(int j = 1; j <= stars; j++){
                System.out.print(ca + "\t");
                
                if( j <= stars/2){
                    ca++;
                }
                else{
                    ca--;
                }
            }
            if( i <= n/2 ){
                spaces--;
                stars+=2;
                a++;
            }
            else{
                spaces++;
                stars-=2;
                a--;
            }
            System.out.println();
            
        }

    }
}