package RecursionBacktracking;

import java.io.*;
import java.util.*;
// 
public class printNqueens {
// 
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int chess[][] = new int[n][n];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         chess[i][j] = scn.nextInt();
        //     }
        // }
        printNQueens(chess, "", 0);
        // 
    }
// 
    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }
        for(int col = 0; col < chess.length; col++){
            if(isItASafePlaceforQueen(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + " - " + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }
// 
    public static boolean isItASafePlaceforQueen(int chess[][], int row, int col){
        // Doing straight(vertically)
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        // checking diagonaly left side
        for(int i = row - 1, j = col - 1; i >= 0 && j>= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        // checking diagonaly right side
        for(int i = row - 1, j = col + 1; i >=  0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
