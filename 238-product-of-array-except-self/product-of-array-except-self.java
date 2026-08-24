class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];
        int t=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                answer[i]=t;
            }
            else{
                t=t*nums[i-1];
                answer[i] = t;
            }
        }
        int right = 1;
        for(int i=nums.length-1;i>=0;i--)
        {   
            if(i==nums.length-1)
            {
                answer[i]=answer[i]*right;
            }
            else
            {
                right = right*nums[i+1];
                answer[i] = answer[i]*right;
            }
        }
        return answer;
    }
}