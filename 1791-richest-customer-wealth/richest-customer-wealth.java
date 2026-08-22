class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int rowsum=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                rowsum+=accounts[i][j];
            }
            if(rowsum>max)
            {
                max = rowsum;
            }
            rowsum=0;
        }
        return max;

    }
}