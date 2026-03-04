class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int res=nums[0]+nums[1]+nums[2];
        int mindiff=Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    left++;
                }
                else{ 
                    right--;
                }
                
                int sumdiff=Math.abs(sum-target);

                if(sumdiff<mindiff){
                    res=sum;
                    mindiff=sumdiff;
                }
            }
        }
        return res;
    }
}
