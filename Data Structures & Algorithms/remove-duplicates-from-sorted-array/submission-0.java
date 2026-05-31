class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=1) return n;
        int i = 1; int j = n-1; int k = 0;
        for(k = 1; k < n; k++){
            if(nums[k] != nums[k-1]){
                nums[i++] = nums[k];
            }
        }
        return i;
    }
}