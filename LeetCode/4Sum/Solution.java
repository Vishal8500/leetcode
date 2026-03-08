1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> res=new ArrayList<>();
4
5        Arrays.sort(nums);
6
7        for(int i=0;i<nums.length-3;i++){
8            if(i>0 && nums[i]==nums[i-1]) continue;
9            for(int j=i+1;j<nums.length-2;j++){
10                if(j>i+1 && nums[j]==nums[j-1]) continue;
11
12                int left=j+1;
13                int right=nums.length-1;
14
15                while(left<right){
16
17                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
18
19                    if(sum==target){
20                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
21
22                        left++;
23                        right--;
24
25                        while(left<right && nums[left]==nums[left-1]) left++;
26                        while(left<right && nums[right]==nums[right+1]) right--;
27                    }
28
29                    else if(sum<target){
30                        left++;
31                    }
32                    else{
33                        right--;
34                    }
35                }
36                
37            }
38        }
39        return res;
40
41    }
42}