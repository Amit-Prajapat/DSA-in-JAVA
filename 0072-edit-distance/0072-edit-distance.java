class Solution {
    public static int solve(String s1,String s2,int i,int j,int[][] dp){
        int m = s1.length();
        int n = s2.length();
        if(i==m) return n-j;
        if(j==n) return m-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = solve(s1,s2,i+1,j+1,dp);
        }
        int insert = 1+solve(s1,s2,i,j+1,dp);
        int delete = 1+solve(s1,s2,i+1,j,dp);
        int replace = 1+solve(s1,s2,i+1,j+1,dp);
        return dp[i][j] = Math.min(Math.min(insert,delete),replace);
    }
    public static int tabulation(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = i+j;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int insert = 1+dp[i][j-1];
                    int delete = 1+dp[i-1][j];
                    int replace = 1+dp[i-1][j-1];
                    dp[i][j] = Math.min(Math.min(insert,delete),replace);
                }
            }
        }
        return dp[m][n];
    }
    public int minDistance(String s1, String s2) {
        // int m = s1.length();
        // int n = s2.length();
        // int[][] dp = new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         dp[i][j] = -1;
            // }
        // }
        // return solve(s1,s2,0,0,dp);
        return tabulation(s1,s2);
    }
}