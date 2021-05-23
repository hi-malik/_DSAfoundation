import java.io.*;
import java.util.*;

public class pep {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int chess[][] = new int[n][n];
        printNQueens(chess, "", 0);
        
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }
        for(int i = 0; i < chess.length; i++){
            if(isSafe(chess, row, i)){
                chess[row][i] = 1;
                printNQueens(chess, qsf + row + "-" + i + ", ", row + 1);
                chess[row][i] = 0;    
            }
        }
    }
    
    public static boolean isSafe(int chess[][], int row, int col){
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[row][j] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[row][col] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[row][col] == 1){
                return false;
            }
        }
        return true;
    }
}