class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = i+1;
        while(j < n){
            while(j<n && nums[j] == nums[i]) j++;
            if(j==n) break;
            i++;
            nums[i] = nums[j];
            j++;
        }
        return i+1;
    }
}