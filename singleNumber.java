public class Solution {
    public int singleNumber(int[] A) {
     // Using XOR operation;
      for (int i=1;i<A.length;i++){
          A[i]= A[i] ^ A[i-1];
      }
        return A[A.length-1];
        
    }
}
