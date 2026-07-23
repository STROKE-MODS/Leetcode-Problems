class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int width = right - left;
            int current_Area = Math.min(height[left],height[right])*width;
            maxArea = Math.max(maxArea,current_Area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;

    }
}