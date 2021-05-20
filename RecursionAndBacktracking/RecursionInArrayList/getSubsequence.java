import java.io.*;
import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> res = gss(str);
        System.out.println(res);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); //we get a from here
        String ros = str.substring(1); //we get afre b all the element from here
        ArrayList<String> rres = gss(ros); //[--, -c, b-, bc]
        
        ArrayList<String> mres = new ArrayList<>();
        for( String rstr: rres){
            mres.add("" + rstr);

        }
        for( String rstr: rres){

            mres.add(ch + rstr);
        }
        return mres;
    }

}