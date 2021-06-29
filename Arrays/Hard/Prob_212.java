import java.util.*;
class Prob_212 {
    public static class Pair
    {
        int x;
        int y;
        Pair(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    public static boolean dfs(char[][] board, int i, int j, int cnt, String word)
    {
        if(cnt==word.length())
        {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(cnt))
        {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' '; 
        boolean found = dfs(board, i+1,j,cnt+1,word) || dfs(board,i-1,j,cnt+1,word)
                     || dfs(board, i,j+1,cnt+1,word) || dfs(board,i,j-1,cnt+1,word);
        board[i][j] = temp; 
        return found;
    }
    public static boolean exists(char[][] board,List<Pair> li, String word)
    {
        if(li==null)
        {
            return false;
        }
        for(Pair p: li)
        {
            int i = p.x;
            int j = p.y;
            if(dfs(board,i,j,0,word))
            {
                return true;
            }
        }
        return false;
    }
    public List<String> findWords(char[][] board, String[] words) {
        HashMap<Character,List<Pair>> mp = new HashMap<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(mp.get(board[i][j])==null)
                {
                    List<Pair> li = new ArrayList<>();
                    Pair p = new Pair(i,j);
                    li.add(p);
                    mp.put(board[i][j],li);
                }
                else
                {
                    List<Pair> lii = mp.get(board[i][j]);
                    lii.add(new Pair(i,j));
                    mp.put(board[i][j], lii);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for(String i:words)
        {
            List<Pair> pos = mp.get(i.charAt(0));
            if(exists(board,pos,i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}