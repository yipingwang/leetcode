public class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int i=0;
        int j=height.length-1;
        if (j<=0) return 0;
        while (i<j){
            int currentArea = Math.abs(i-j) * Math.min(height[i],height[j]);
            if (height[i]<height[j])
                i++;
            else
                j--;
            if (currentArea>maxArea) maxArea = currentArea;
        }
    return maxArea;
    }
}
