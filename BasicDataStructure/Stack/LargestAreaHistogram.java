import java.io.*;
import java.util.*;

public class LargestAreaHistogram{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    
    int lb[] = new int[a.length]; //next smallest element index on left
    Stack<Integer> st = new Stack<>();
    st.push(0); // start from left
    lb[0] = -1; // 0 ke left mn kya hoga
    for(int i = 1; i < a.length; i++){
        while(st.size() > 0 && a[i] <= a[st.peek()]){
            st.pop();
        }
        
        if(st.size() == 0){
            lb[i] = -1;
        }
        else{
            lb[i] = st.peek();
        }
        st.push(i);
    }
    
    int rb[] = new int[a.length]; //next smallest element index on rigth
    st = new Stack<>();
    st.push(a.length - 1); // start from right
    rb[a.length - 1] = a.length; // last wale ke right mn kya hoga array ka size
    for(int i = a.length - 2; i >= 0; i--){
        while(st.size() > 0 && a[i] <= a[st.peek()]){
            st.pop();
        }
        
        if(st.size() == 0){
            rb[i] = a.length;
        }
        else{
            rb[i] = st.peek();
        }
        st.push(i);
    }
    
    int maxArea = 0;
    for(int i = 0; i < a.length; i++){
        int width = rb[i] - lb[i] - 1;
        int area = width * a[i];
        if(maxArea < area){
            maxArea = area;
        }
    }
    System.out.println(maxArea);
 }
}