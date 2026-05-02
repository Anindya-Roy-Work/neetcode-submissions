class Solution {
    public int findDuplicate(int[] nums) {
        /*
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[Math.abs(nums[i])-1] < 0) return Math.abs(nums[i]);
            nums[Math.abs(nums[i])-1]*=-1;
        }
        return -1;
        */
        int slow = 0, fast = 0, slow2 = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        do{
            slow = nums[slow];
            slow2 = nums[slow2];
        }while(slow!=slow2);
        return slow;
    }
}
