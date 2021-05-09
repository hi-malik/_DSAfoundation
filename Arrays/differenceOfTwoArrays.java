import java.io.*;
import java.util.*;

public class differenceOfTwoArrays {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        int diff[] = new int[n2];
        int carry = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;

        while( k >= 0){
            int value = 0;
            int arr1v = i >= 0? arr1[i]: 0;
            if( arr2[j] + carry >= arr1v){
                value = arr2[j] + carry -arr1v;
                carry = 0;        
            }
            else{
                value = arr2[j] + carry + 10 - arr1v;
                carry = -1;
            }

            diff[k] = value;

            i--;
            j--;
            k--;
        }

        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] == 0){
                break;
            }
            else{
                idx++;
            }

        }

        while( idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }

}