class Solution {
    static int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        
        return help(n);
    }
    public int help(int n){
         if(n<=1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        else{
        dp[n]=help(n-1)+help(n-2);
      return dp[n];}
    }
}