class Solution {
    static int[] dp;
    public int rob(int[] arr) {
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return sum(0,arr);
        
    }
     public int sum(int i,int arr[]){
         if(i>=arr.length)return 0;
         if(dp[i]!=-1)return dp[i];
         int pick=arr[i]+sum(i+2,arr);
         int skip=sum(i+1,arr);
         return dp[i]=Math.max(pick,skip);
        
    }
}
