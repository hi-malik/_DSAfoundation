import java.io.*;
import java.util.*;

public class GetCommonElement2{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    for(int i = 0; i < n1; i++){
        a1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    for(int i = 0; i < n2; i++){
        a2[i] = scn.nextInt();
    }
    
    HashMap<Integer, Integer> fmap = new HashMap<>();
    for(int val: a1){
        if(fmap.containsKey(val)){
            int of = fmap.get(val);
            int nf = of + 1;
            fmap.put(val, nf);
        }
        else{
            fmap.put(val, 1);
        }
    }
    for(int val: a2){
        if(fmap.containsKey(val) && fmap.get(val) > 0){
            System.out.println(val);
            int of = fmap.get(val);
            int nf = of - 1;
            fmap.put(val, nf);
        }
    }
 }

}