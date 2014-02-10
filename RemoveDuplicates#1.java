public class Solution {
    public int removeDuplicates(int[] A) {
        int length = A.length;
        if (length==0 || length==1 ) return length;
        int index=0;
        for (int i=1;i<length;i++){
           if (A[index]!=A[i]){
               ++index;
               A[index]=A[i];
               
           }
            
        }
        return index+1;
        
    }
}
