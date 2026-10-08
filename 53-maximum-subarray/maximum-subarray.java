class Solution {
    public int maxSubArray(int[] nums) {
     int currentSum = nums[0], oralSum = nums[0];

     for(int i=1;i<nums.length;i++){
        if(currentSum + nums[i] > nums[i]){
            currentSum = currentSum + nums[i];
        }else currentSum = nums[i];
        oralSum = Math.max(currentSum, oralSum);
     }
     return oralSum;
    }
}