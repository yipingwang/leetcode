public class Solution {
    public int divide(int dividend, int divisor) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int flag=1;
        if (divisor==0) return -32176;
        if (dividend==0) return 0;
        if (dividend<0) { flag=-flag; dividend = -dividend;}
        if (divisor<0) { flag=-flag; divisor = -divisor;}
        long  a =(long) dividend;
        long  b = (long) divisor;
        int count = 0;  
        while(a >= b)
        {  
            long temp = b;  
            int multi = 1;  
            while(a >= temp)
            {  
                count += multi;  
                a -= temp;  
                temp += temp;  
                multi += multi;  
            }  
        }  
    }
}
