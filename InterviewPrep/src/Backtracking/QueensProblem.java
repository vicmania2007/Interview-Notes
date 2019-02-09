package Backtracking;


public class QueensProblem 
{ 
    final int N = 4; 
    void printSolution(int board[][]) 
    { 
    	System.out.println("GeeksForGeeks");
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++)
            	if(board[i][j] == 1) 
            		System.out.print(" * "); 
            	else 
            		System.out.print(" " + board[i][j] 
                     + " "); 
            System.out.println(); 
        } 
    } 

    boolean isSafe(int board[][], int row, int col) 
    { 
        int i, j; 
  
        for (i = 0; i < col; i++) 
            if (board[row][i] == 1) 
                return false; 
  
        for (i=row, j=col; i>=0 && j>=0; i--, j--) 
            if (board[i][j] == 1) 
                return false; 
  
        for (i=row, j=col; j>=0 && i<N; i++, j--) 
            if (board[i][j] == 1) 
                return false; 
  
        return true; 
    } 
  
    boolean solveNQUtil(int board[][], int col) 
    { 
        if (col >= N) 
            return true; 
  
        for (int i = 0; i < N; i++) 
        { 
            if (isSafe(board, i, col)) 
            { 
                board[i][col] = 1; 
                if (solveNQUtil(board, col + 1) == true) 
                    return true; 
                board[i][col] = 0; // BACKTRACK 
            } 
        } 
        return false; 
    } 
    boolean solveNQ() 
    { 
    	int[][] board = new int[N][N];
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                board[i][j] = 0;
  
        if (solveNQUtil(board, 0) == false) 
        { 
            System.out.print("Solution does not exist"); 
            return false; 
        } 
  
        printSolution(board); 
        return true; 
    } 
  
    public static void main(String args[]) 
    { 
    	QueensProblem Queen = new QueensProblem(); 
        Queen.solveNQ(); 
    } 
} 


