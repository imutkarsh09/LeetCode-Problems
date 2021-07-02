import java.util.*;
class Prob_1010 {
    
    public HashMap<Integer,Integer> getFreqModu(int[] Ar)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<Ar.length;i++)
        {
            mp.put(Ar[i],mp.getOrDefault(Ar[i],0)+1);
        }
        return mp;
    }
    public int numPairsDivisibleBy60(int[] time) {
        for(int i=0;i<time.length;i++)
        {
            time[i] = time[i]%60;
        }
        HashMap<Integer,Integer> freq = getFreqModu(time);
        // System.out.println(freq);
        int cnt=0;
        for(int i=1;i<30;i++)
        {
            if(freq.containsKey(i) && freq.containsKey(60-i))
            {
                cnt+= freq.get(i)*freq.get(60-i);
            }
        }
        if(freq.containsKey(0))
        {
            cnt+= (freq.get(0)-1)*(freq.get(0))/2;
        }
        if(freq.containsKey(30))
        {
            cnt+=(freq.get(30)-1)*(freq.get(30))/2;
        }
        return cnt;
    }
}