package RecursionBacktracking;

import java.io.*;
import java.util.*;

public class knightTour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int chess[][] = new int[n][n];
        printKnightsTour(chess, r, c, 1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingmove) {
        
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0){
            return;
        }
        else if( upcomingmove == chess.length * chess.length){
            chess[r][c] = upcomingmove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingmove;
        printKnightsTour(chess, r - 2, c + 1, upcomingmove + 1);
        printKnightsTour(chess, r - 1, c + 2, upcomingmove + 1);
        printKnightsTour(chess, r + 1, c + 2, upcomingmove + 1);
        printKnightsTour(chess, r + 2, c + 1, upcomingmove + 1);
        printKnightsTour(chess, r + 2, c - 1, upcomingmove + 1);
        printKnightsTour(chess, r + 1, c - 2, upcomingmove + 1);
        printKnightsTour(chess, r - 1, c - 2, upcomingmove + 1);
        printKnightsTour(chess, r - 2, c - 1, upcomingmove + 1);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}