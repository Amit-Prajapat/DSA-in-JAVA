class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        int domt = 0;
        if(n==1) return 1;
        System.out.println(domt);
        if(nums[0]>=nums[1]) domt++;
        System.out.println(domt);
        for(int i=1;i<n-1;i++){
           double avg = (nums[i-1]+nums[i+1])/2.0;
            if(nums[i]>=avg) domt++;
            System.out.println(domt);
        }
        if(nums[n-1]>=nums[n-2]) domt++;
        System.out.println(domt);
        return domt;
    }
}