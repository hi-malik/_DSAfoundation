import java.io.*;
import java.util.*;

public class getKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    }
    
    static String codes[] = {
        ".;",
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

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); //5
        String ros = str.substring(1); //73
        
        ArrayList<String> faith = getKPC(ros); //6 words for 73
        ArrayList<String> mres = new ArrayList<>(); //24 words for 573
        
        String codeforch = codes[ch - '0'];
        for(int i = 0; i < codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for(String rstr: faith){
                mres.add(chcode + rstr);
            }
        }
        return mres;
        
    }

}