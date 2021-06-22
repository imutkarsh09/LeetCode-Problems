import java.util.*;
class Prob_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar_asc = (int)(target);
        char ans= letters[0];
        for(char i:letters)
        {
            int asc = (int)(i);
            if(asc>tar_asc)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}