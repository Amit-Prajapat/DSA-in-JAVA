class Solution {
    //0->false, 1->true
    public int check(int i,int j,String s,int[][] dp){
        if(i>j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)) return check(i+1,j-1,s,dp);
        return 0;
    }
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(check(i,j,s,dp)==1) count++;
            }
        }
        return count;
    }
}