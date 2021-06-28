import java.util.*;
class Prob_54{
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        int dir=0;
        List<Integer> li = new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    li.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    li.add(matrix[i][right]);
                } 
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir==3)
            {
                for(int i=bottom;i>=top;i--)
                {
                    li.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return li;
    }
}