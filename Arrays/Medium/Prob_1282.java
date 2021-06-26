import java.util.*;
public class Prob_1282
{

    public static List<List<Integer>> groupThePeople(int[] Ar)
    {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0;i<Ar.length;i++)
        {
            // System.out.println("Check me bro!!!!");
            // System.out.println(mp.get(Ar[i]));
            if(mp.get(Ar[i])==null)
            {
                mp.put(Ar[i], new ArrayList<Integer>(Arrays.asList(i)));
            }
            else
            {
                // System.out.println("Yes it was");
                // System.out.println(mp.get(Ar[i]));
                List<Integer> l = new ArrayList<>();
                l = mp.get(Ar[i]);
                l.add(i);
                mp.put(Ar[i],l);
            }
        }
        // System.out.println(mp);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i:mp.keySet())
        {
            int key = i;
            List<Integer> li = mp.get(key);
            // System.out.println(li);
            int cnt=0;
            List<Integer> lih = new ArrayList<>();
            for(int p:li)
            {
                // System.out.println(cnt+"  "+key);
                if(cnt<key)
                {
                    lih.add(p);
                    cnt++;
                }
                else
                {
                    ans.add(lih);
                    cnt=0;
                    lih = new ArrayList<>();
                    lih.add(p);
                    cnt++;
                }
            }
            ans.add(lih);
        }
        return ans;
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Ar = new int[n];
        for(int i=0;i<n;i++)
        {
            Ar[i]=sc.nextInt();
        }
        List<List<Integer>> sol = groupThePeople(Ar);
        System.out.println(sol);
    }
}