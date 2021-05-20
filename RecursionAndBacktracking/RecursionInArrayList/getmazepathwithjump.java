import java.io.*;
import java.util.*;

public class getmazepathwithjump {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n-1, m-1);
        System.out.println(paths);
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
        if(sc > dc || sr > dr){
            return new ArrayList<>();
        }
        
        ArrayList<String> path = new ArrayList<>();
        
        //hortizontal
        for(int ms = 1; ms <= dc - sc; ms++){
            ArrayList<String> hpath = getMazePaths(sr, sc + ms, dr, dc);
            for(String hpaths: hpath){
                path.add("h" + ms + hpaths);
            }
        }
        //vertical
        for(int ms = 1; ms <= dr - sr; ms++){
            ArrayList<String> vpath = getMazePaths(sr + ms, sc, dr, dc);
            for(String vpaths: vpath){
                path.add("v" + ms + vpaths);
            }
        }
        //diagonal
        for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
            ArrayList<String> dpath = getMazePaths(sr + ms, sc + ms, dr, dc);
            for(String dpaths: dpath){
                path.add("d" + ms + dpaths);
            }
        }
        
        return path;
    }

}