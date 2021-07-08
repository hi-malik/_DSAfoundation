package revision2;

import java.io.*;
import java.util.*;

public class st3 {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> value = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> postfix = new Stack<>();

    for (int i = exp.length() - 1; i >= 0; i--) {
      char ch = exp.charAt(i);
      if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        int v2 = value.pop();
        int v1 = value.pop();
        int val = operator(v1, v2, ch);
        value.push(val);

        String inv2 = infix.pop();
        String inv1 = infix.pop();
        String inval = "(" + inv1 + ch + inv2 + ")";
        infix.push(inval);

        String posv2 = postfix.pop();
        String posv1 = postfix.pop();
        String posval = posv1 + posv2 + ch;
        postfix.push(posval);
      }
      else {
        value.push(ch - '0');
        infix.push(ch + "");
        postfix.push(ch + "");
      }
    }
    System.out.println(value.pop());
    System.out.println(infix.pop());
    System.out.println(postfix.pop());
  }
  public static int operator(int v1, int v2, char opnds) {
    if (opnds == '+') {
      return v1 + v2;
    }
    else if (opnds == '-') {
      return v1 - v2;
    }
    else if (opnds == '*') {
      return v1 * v2;
    }
    else if (opnds == '/') {
      return v1 / v2;
    }
    else {
      return 0;
    }
  }
}