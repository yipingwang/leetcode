public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
         int[] result = new int[2];
         
         
         for (int i=0;i<numbers.length-1;i++)
         {
             for (int j=i+1;j<numbers.length;j++)
             {
                if (numbers[i] + numbers[j] == target)
                 {
                     result[0]=i+1;
                     result[1]=j+1;
                     break;
                 }
                 continue;
             }
         }
        
         return result;
         
    }
}
