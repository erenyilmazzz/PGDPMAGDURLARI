import java.util.*;
public class Sudoku {
    public static void main(String[] args){
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9},
        };
        SudokuSolver sudoku= new SudokuSolver(board);
        sudoku.solveSudoku();
        sudoku.printSolution();
    }
}
class SudokuSolver{
    public int[][] board;
    public SudokuSolver(int[][] board){
        this.board=board;
    }
    public void printSolution(){
        for (int i = 0; i < board.length; i++) {
            if (i%3==0) System.out.print("\n******************************************");
            else System.out.print("\n------------------------------------------");
            System.out.println();
            for (int j = 0; j < board[i].length; j++) {
                if (j%3==0)System.out.print(" || "+board[i][j]);
                else System.out.print(" | "+board[i][j]);
            }
            System.out.print(" || ");
        }
        System.out.print("\n******************************************");
    }
    public boolean isSafe(int[][] board, int row,int col,int num){
        if (board[row][col]!=0)return false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]==num)return false;
        }
        for (int i = 0; i <board[row].length; i++) {
            if (board[row][i]==num) return false;
        }
        int rS=(row/3)*3;
        int cS=(col/3)*3;
        for (int i=rS; i<rS+3;i++) {
            for (int j=cS;j<cS+3; j++) {
                if (i==row&&j==col)continue;
                if (board[i][j]==num) return false;
            }
        }
        return true;
    }
    public boolean solveSudoku(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board[i].length; j++) {
                if (board[i][j]==0){
                    for (int num=1;num<= board.length;num++){
                        if (isSafe(board,i,j,num)){
                            board[i][j]=num;
                            if (solveSudoku())return true;
                            else{
                                board[i][j]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
class wow{

}