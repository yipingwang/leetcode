public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] result = new int[2];
        result[0]=result[1]=-1;
        
        int low=0, high=A.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (A[mid] == target)
            {
                if (A[mid]!=A[mid-1] && A[mid]!=A[mid+1]){
                    result[0]=result[1]=mid;
                    break;
                }
                else{
                    int temp=A[mid];int count1=0,count2=0;
                    while (A[mid-1]==temp){
                        count1++;
                    }
                    while (A[mid+1]==temp){
                        count2++;
                    }
                    result[0]=mid-count1;result[1]=mid+count2;
                    break;
                }
                
                
            }
            else if (A[mid]<target){
                int low=mid;
                continue;
            }
            else {
                int high=mid;
                continue;
            }
            
        }
        return result;
    }
}
