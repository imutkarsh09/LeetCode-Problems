class Prob_344
{
    public void help(char[] s, int i, int high)
    {
        
        if(i >= high) 
            return;
        
        char temp = s[i];
        s[i] = s[high];
        s[high] = temp;
        
        help(s, i+1, high-1); 
    }
    
    public void reverseString(char[] s) 
    {
        int n = s.length-1;
        help(s, 0 , n);
    }
}