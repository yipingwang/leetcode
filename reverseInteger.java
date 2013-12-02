public class Solution {
    public int reverse(int x) {
       int flag=0;
       if (x<0) 
       {
           x=-x;
            flag=-1;    
       }
        int result=0;int carry=0;
        while (x>=10)
        {
            carry=x%10;
            x=x/10;
            result = 10*(result+carry);
            
            
        }
        result = result + x;
        
        return flag<0?-result:result;
    }
   
}
