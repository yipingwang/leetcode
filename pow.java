public class Solution {
    public double pow(double x, int n) {
        // IMPORTANT: Please reset any member data you declared, as
     if (n==0) return 1;
        if (x==0.) return 0;
        if (x==1.0) return 1;
        if (n<0) 
        {
            n=-n;
            x=1.0/x;
        }
      
        double result=1.0;
        while(n>0)
        {
            if (n%2==1) result=result*x;
            x*=x;
            n=n/2;
            
        }
        return result;
    }
}
