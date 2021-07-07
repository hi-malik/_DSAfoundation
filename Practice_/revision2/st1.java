package revision2;

import java.io.*;
import java.util.*;

public class st1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        // code
        int left[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        left[0] = -1;
        for (int i = 1; i < a.length; i++) {
            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }
            st.push(i);
        }

        int right[] = new int[a.length];
        st = new Stack<>();
        st.push(a.length - 1);
        right[a.length - 1] = a.length;
        for (int i = a.length - 2; i >= 0; i--) {
            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                right[i] = a.length;
            } else {
                right[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < a.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = width * a[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}