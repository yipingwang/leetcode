
public class Solution {
    public int[] plusOne(int[] digits) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
      
       
      int carry=0, i=digits.length-1;
      digits[i]+=1;
      if (digits[i]<10) return digits;
      
       while(digits[i]>=10)
       {
       digits[i]-=10;
       i--;
       if (i>=0) 
       {digits[i]++;}
       else { carry=1;break; }
       }
       
       if (carry==0) return digits;
        int[] result = new int[digits.length+1];
        result[0]=1;
        for(i=0;i<digits.length;i++){
            result[i+1]=digits[i];
        }
         return result;
       
       
      
      
        
        
        
    }
}
Submit Solution
