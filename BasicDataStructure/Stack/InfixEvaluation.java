import java.io.*;
import java.util.*;

public class InfixEvaluation{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> opnds = new Stack<>();
    Stack<Character> optor = new Stack<>();
    
    for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);
        if(ch == '('){
            optor.push(ch);
        }
        else if(Character.isDigit(ch)){
            opnds.push(ch - '0'); // char to int
        }
        else if(ch == ')'){
            while(optor.peek() != '('){
                char optr = optor.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                
                int opv = operand(v1, v2, optr);
                opnds.push(opv);
            }
            optor.pop();
        }
        
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            // ch is wanting higher priority operators to solve first
            while(optor.size() > 0 && optor.peek() != '(' && precedence(ch) <= precedence(optor.peek())){
                char optr = optor.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                
                int opv = operand(v1, v2, optr);
                opnds.push(opv);
            }
            // ch is pushing itself now
            optor.push(ch);
        }
    }
    while(optor.size() != 0){
        char optr = optor.pop();
        int v2 = opnds.pop();
        int v1 = opnds.pop();
                
        int opv = operand(v1, v2, optr);
        opnds.push(opv);
    }
    System.out.println(opnds.peek());
 }
 public static int precedence(char optor){
     if(optor == '+'){
         return 1;
     }
     else if(optor == '-'){
         return 1;
     }
     else if(optor == '*'){
         return 2;
     }
     else{
         return 2;
     }
 }
 public static int operand(int v1, int v2, char optor){
     if(optor == '+'){
         return v1 + v2;
     }
     else if(optor == '-'){
         return v1 - v2;
     }
     else if(optor == '*'){
         return v1 * v2;
     }
     else{
         return v1 / v2;
     }
 }
}