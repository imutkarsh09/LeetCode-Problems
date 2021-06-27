import java.util.*;
class Prob_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int chk;
        if(ruleKey.equals("color"))
        {
            chk=1;
        }
        else if(ruleKey.equals("type"))
        {
            chk=0;
        }
        else
        {
            chk=2;
        }
        int cnt=0;
        for(int i=0;i<items.size();i++)
        {
            String tochk = items.get(i).get(chk);
            if(tochk.equals(ruleValue))
            {
                cnt++;
            }
        }
        return cnt;
    }
}