1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res=new ArrayList<>();
4        Arrays.sort(nums);
5
6        
7        for(int i=0;i<nums.length-2;i++){
8            
9            if(i>0 && nums[i]==nums[i-1]) continue;
10            int left=i+1;
11            int right=nums.length-1;
12
13            while(left<right){
14                int sum=nums[i]+nums[left]+nums[right];
15
16                if(sum==0){
17                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
18                    left++;
19                    right--;
20
21                    while(left<right && nums[left]==nums[left-1]) left++;
22                    while(left<right && nums[right]==nums[right+1]) right--;
23                }
24                else if(sum<0){
25                    left++;
26
27                }
28
29                else{
30                    right--;
31                }
32            }
33            
34
35        }
36        return res;
37    }
38}