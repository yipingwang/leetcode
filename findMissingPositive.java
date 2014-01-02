public class Solution {
    public int firstMissingPositive(int[] A) {
        Arrays.sort(A); // sort first
        int lastValue = 0; //record the current smallest positive 
        for (int value: A){
            if (value>0) // only consider positive; ignore negative
            {
                if (value==lastValue)
                    continue; //if number equals current, skip and move on
                if (value==lastValue+1) 
                    lastValue=value;// reset current smallest positive.
                else
                    break;
                    
            
            }
            
        }
        return lastValue+1; // get the result: smalest missing positive
    }
}
