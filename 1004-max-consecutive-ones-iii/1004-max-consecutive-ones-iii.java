class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zeroCount = 0;
        int i = 0,maxLen = 0;
        for(int j=0;j<n;j++){
            if(nums[j]==0) zeroCount++;

            while(zeroCount>k){
                if(nums[i]==0){
                    zeroCount--;
                }
                i++;
            }
            int len = j-i+1;
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}