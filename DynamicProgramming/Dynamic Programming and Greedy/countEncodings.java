import java.io.*;
import java.util.*;

public class countEncodings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int qb[] = new int[str.length()];
        qb[0] = 1;
        for(int i = 1; i < qb.length; i++){
            if(str.charAt(i-1) == '0' && str.charAt(i) == '0'){
                qb[i] = '0';
            }
            else if(str.charAt(i-1) == '0' && str.charAt(i) != '0'){
                qb[i] = qb[i-1];
            }
            else if(str.charAt(i-1) != '0' && str.charAt(i) == '0'){
                if(str.charAt(i-1) == '1' || str.charAt(i-1) == '2'){
                    qb[i] = (i >= 2 ? qb[i-2] : 1);
                }
                else{
                    qb[i] = 0;
                }
            }
            else{
                if(Integer.parseInt(str.substring(i-1, i+1)) <= 26){
                    qb[i] = qb[i-1] + (i >= 2 ? qb[i-2] : 1);
                }
                else{
                    qb[i] = qb[i-1];
                }
            }
        }
        System.out.println(qb[str.length() - 1]);
    }
}