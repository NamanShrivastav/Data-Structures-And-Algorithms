class Solution {
    public int kedans(int[] nums){
        int cs = nums[0], os = nums[0];
        for(int i=1;i<nums.length;i++){
            if(cs+nums[i] > nums[i]){
                cs=cs+nums[i];
            }else cs=nums[i];
            os = Math.max(cs,os);
        }
            return os;
    }
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==0) return 0;
        int linearSum = kedans(nums);
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
            nums[i] *= -1;
        }
        int invertedSum = kedans(nums);
        if(totalSum + invertedSum == 0) return linearSum;
        return Math.max(linearSum , totalSum+invertedSum);
    }
}