package revision2;

import java.io.*;
import java.util.*;

public class st2 {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();// code
    Stack<Integer> digit = new Stack<>();
    Stack<Character> operator = new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
      char ch = exp.charAt(i);
      if (ch == '(') {
        operator.push(ch);
      }
      else if (Character.isDigit(ch)) {
        digit.push(ch - '0');
      }
      else if (ch == ')') {
        while (operator.peek() != '(') {
          char opt = operator.pop();
          int v2 = digit.pop();
          int v1 = digit.pop();
          int val = operate(v1, v2, opt);
          digit.push(val);
        }
        operator.pop();
      }
      else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
          char opt = operator.pop();
          int v2 = digit.pop();
          int v1 = digit.pop();
          int val = operate(v1, v2, opt);
          digit.push(val);
        }
        operator.push(ch);
      }
    }
    while (operator.size() != 0) {
      char opt = operator.pop();
      int v2 = digit.pop();
      int v1 = digit.pop();
      int val = operate(v1, v2, opt);
      digit.push(val);
    }
    System.out.println(digit.peek());
  }
  public static int precedence(char optor) {
    if (optor == '+') {
      return 1;
    }
    else if (optor == '-') {
      return 1;
    }
    else if (optor == '*') {
      return 2;
    }
    else if (optor == '/') {
      return 2;
    }
    else {
      return 0;
    }
  }
  public static int operate(int v1, int v2, char optor) {
    if (optor == '+') {
      return v1 + v2;
    }
    else if (optor == '-') {
      return v1 - v2;
    }
    else if (optor == '*') {
      return v1 * v2;
    }
    else {
      return v1 / v2;
    }
  }
}