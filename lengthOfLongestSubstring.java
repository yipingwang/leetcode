public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
      
        HashSet<Character> hs = new HashSet<Character>();
        int start=0;
        int longest=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (!hs.contains(c))
            {
                hs.add(c);
                longest= Math.max(longest, i-start+1);
            }
            else
            {
                for(int j=start;j<i;j++)
                {
                     if(s.charAt(j)==c)
                     {
                        start=j+1;break;
                     }
                     else
                     {
                         hs.remove(s.charAt(j));
                     }
                      
                    
                }
            }
        }
        return longest;
    }
}
