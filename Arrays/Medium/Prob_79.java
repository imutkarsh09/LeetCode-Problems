import java.util.*;
class Prob_79 {
    
    public boolean dfs(char[][] board, int i, int j, int cnt, String word)
    {
        if(cnt == word.length())
        {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!= word.charAt(cnt))
        {
            return false;
        }
        char temp = board[i][j];
        board[i][j]=' ';
        boolean found = dfs(board,i+1,j, cnt+1, word) 
                     || dfs(board,i-1,j,cnt+1,word)
                     || dfs(board,i,j+1,cnt+1,word)
                     || dfs(board,i,j-1,cnt+1,word);
        board[i][j] = temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,0,word))
                {
                    return true;
                }
            }
        }
        return false;
    }
}