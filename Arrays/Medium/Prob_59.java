import java.util.*;
class Prob_59 {
    public int[][] generateMatrix(int n) {
        int top=0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int dir=0;
        int sta=1;
        int[][] Ar = new int[n][n];
        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    Ar[top][i]=sta;
                    sta++;
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    Ar[i][right]=sta;
                    sta++;
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    Ar[bottom][i]=sta;
                    sta++;
                }
                bottom--;
            }
            else if(dir==3)
            {
                for(int i=bottom;i>=top;i--)
                {
                    Ar[i][left]=sta;
                    sta++;
                }
                left++;
            }
            dir = (dir+1)%4;
        }
        return Ar;
    }
}