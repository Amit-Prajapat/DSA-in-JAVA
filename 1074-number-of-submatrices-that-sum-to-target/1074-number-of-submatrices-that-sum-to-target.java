class Solution {
    public int numSubmatrixSumTarget(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        for(int top=0;top<m;top++){
            int[] colSum = new int[n];
            for(int bottom=top;bottom<m;bottom++){
                for(int c=0;c<n;c++){
                    colSum[c]+=arr[bottom][c];
                }
                count+=subarraySum(colSum,target);
            }
        }
        return count;
    }
    private int subarraySum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0,count = 0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-target)){
                count+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}