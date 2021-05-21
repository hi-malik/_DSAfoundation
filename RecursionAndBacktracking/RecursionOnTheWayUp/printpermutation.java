import java.io.*;
import java.util.*;

public class printpermutation {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");

    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String strLpart = str.substring(0, i);
            String strRpart = str.substring( i + 1);
            String roq = strLpart + strRpart;
            printPermutations(roq, asf + ch);
        }
    }

}