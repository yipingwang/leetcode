public class Solution {
    public String strStr(String haystack, String needle) {
        String result = null;
        int size=needle.length();
        if (size==0) return haystack;
        for (int i=0;i+size<=haystack.length();i++)
        {
            if (haystack.substring(i,i+size).equals(needle))
                {
                    result=haystack.substring(i,haystack.length());
                    return result;
                }
                
                
        }
        return result;
        
    }
}
