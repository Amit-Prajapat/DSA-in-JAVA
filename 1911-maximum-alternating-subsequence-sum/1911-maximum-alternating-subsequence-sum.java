class Solution {
    long solve(int i,int[] nums,int flag,long[][] dp){
        if(i>=nums.length) return 0;
        if(dp[i][flag]!=-1) return dp[i][flag];
        long skip = solve(i+1,nums,flag,dp);
        long val = nums[i];
        if(flag==1) val = -val;
        long take = val+solve(i+1,nums,1-flag,dp);
        return dp[i][flag] =  Math.max(take,skip);
    }
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[][] dp = new long[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,nums,0,dp);
    }
}