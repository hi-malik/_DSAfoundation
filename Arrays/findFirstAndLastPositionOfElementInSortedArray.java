import java.util.*;
 
 class findFirstAndLastPositionOfElementInSortedArray {
 
     public static int[] searchRange(int[] nums, int target) {
         //Write your code here
     }
 
     public static void main(String[] args) {
         // TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int[] A = new int[sc.nextInt()];
         for (int i = 0; i < A.length; i++) {
             A[i] = sc.nextInt();
         }
         int[] res = searchRange(A, sc.nextInt());
         for (int a : res) {
             System.out.print(a+" ");
         }
         System.out.println();
     }
 }




//Not done, want to reask from pepcoding teachers




