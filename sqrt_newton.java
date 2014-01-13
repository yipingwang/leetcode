public class Solution {
    public int sqrt(int x) {
        double first = x/2.0;
        double second = (first+x/first)/2.0;
        while (Math.abs(first-second)>0.00001){
            first=second;
            second=(first+x/first)/2.0;
            
        }
        return (int)second;
    }
}
