public class Solution {
    public int removeElement(int[] A, int elem) {
       
        int size=A.length,num=0;
        for (int i=0;i<size;i++)
        {
            if (A[i]!=elem) 
            {
                A[num]=A[i];
                num++;
            }
        }
        return num;
        
            
    }
}
