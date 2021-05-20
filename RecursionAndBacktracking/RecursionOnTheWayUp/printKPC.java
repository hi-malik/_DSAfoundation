import java.io.*;
import java.util.*;

public class printKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");
    }
    
    static String code[] = {
        ".,",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno", 
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    public static void printKPC(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        
        String codeforch = code[ch - '0'];
        for(int i = 0; i < codeforch.length(); i++){
            char cho = codeforch.charAt(i);
            printKPC(roq, asf + cho);
        }
    }

}