import java.util.*;
public class patternType13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            int icj = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(icj + "\t");
                int icjplus1 = icj * (i - j) / (j + 1);
                icj = icjplus1;
            }
            System.out.println();
        }

    }
}