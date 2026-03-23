1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left=0;
4        int minsize=Integer.MAX_VALUE;
5        int sum=0;
6        for(int right=0;right<nums.length;right++){
7            sum+=nums[right];
8
9            while(sum>=target){
10                int window=right-left+1;
11                if(window<minsize){
12                    minsize=window;
13                }
14                sum-=nums[left];
15                left++;
16            }
17        }
18
19        
20        return minsize==Integer.MAX_VALUE? 0:minsize;
21            
22    }
23}