import java.util.*;
class Prob_229 {
    public List<Integer> majorityElement(int[] Ar) {
        
        int num1=-1;
        int num2=-1;
        int cnt1=0;
        int cnt2=0;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<Ar.length;i++)
        {
            if(Ar[i]==num1)
            {
                cnt1++;
            }
            else if(Ar[i]==num2)
            {
                cnt2++;
            }
            else if(cnt1==0)
            {
                num1=Ar[i];
                cnt1=1;
            }
            else if(cnt2==0)
            {
                num2=Ar[i];
                cnt2=1;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        int cnt1_here=0;
        int cnt2_here=0;
        for(int i=0;i<Ar.length;i++)
        {
            if(Ar[i]==num1)
            {
                cnt1_here++;
            }
            else if(Ar[i]==num2)
            {
                cnt2_here++;
            }
        }
        if(cnt1_here>((Ar.length)/3))
        {
            li.add(num1);
        }
        if(cnt2_here>(Ar.length)/3)
        {
            li.add(num2);
        }
        return li;
    }
}