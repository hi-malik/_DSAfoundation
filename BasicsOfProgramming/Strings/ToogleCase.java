import java.io.*;
import java.util.*;

public class ToogleCase {

	public static String toggleCase(String str){
		//write your code here
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char uc = (char)('A' + ch - 'a');
                sb.setCharAt(i, uc);
            }
            if(ch >= 'A' && ch <= 'Z'){
                char lc = (char)('a' + ch - 'A');
                sb.setCharAt(i, lc);
            }
        }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}