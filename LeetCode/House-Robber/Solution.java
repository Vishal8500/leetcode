1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if(n==0) return 0;
5        if(n==1) return nums[0];
6        int prev1=0;
7        int prev2=0;
8        for(int i=0;i<n;i++){
9            int cur=Math.max(prev1,prev2+nums[i]);
10            prev2=prev1;
11            prev1=cur;
12        }
13        return prev1;
14    }
15}