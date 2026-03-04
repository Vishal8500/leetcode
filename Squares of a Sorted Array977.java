class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int left=0;
        int right=nums.length-1;
        int[] res=new int[nums.length];
        for(int i=res.length-1;i>=0;i--){
            if(nums[left]>nums[right]){
                res[i]=nums[left];
                left++;

            }
            else{
                res[i]=nums[right];
                right--;
            }
        }
        return res;

    }
}
