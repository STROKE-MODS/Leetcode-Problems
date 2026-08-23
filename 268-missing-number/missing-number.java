class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            a = a^nums[i]^i;
        }
        return a;
    }
}