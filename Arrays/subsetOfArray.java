import java.io.*;
import java.util.*;

public class subsetOfArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            // Convert to binary and use 0's and 1's
            int temp = i;
            String str = "";
            for (int j = arr.length - 1; j >= 0; j--) {

                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    str = "-\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.print(str + "\n");

        }
        System.out.println();
    }

}

// Question not completed date-09/05/2021-2:20pm