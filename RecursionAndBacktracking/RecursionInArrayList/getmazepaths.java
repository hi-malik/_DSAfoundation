import java.io.*;
import java.util.*;

public class getmazepaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> getMaze = getMazePaths(1, 1, n, m);
        System.out.println(getMaze);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc == dc && sr == dr){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();
        
        if(sc < dc){
            hpath = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vpath = getMazePaths(sr + 1, sc, dr, dc);
        }
        
        ArrayList<String> faith = new ArrayList<>();
        
        for(String hpaths: hpath){
            faith.add("h" + hpaths);
        }
        for(String vpaths: vpath){
            faith.add("v" + vpaths);
        }
        return faith;
        
    }

}