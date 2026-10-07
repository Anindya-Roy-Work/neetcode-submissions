class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxVal = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                maxVal = Math.max(maxVal,count);
                count = 0;
            }
        }
        maxVal = Math.max(maxVal,count);
        return maxVal;
    }
}