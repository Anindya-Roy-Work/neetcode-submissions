class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length-1;
        int i = 0;
        while(i<=n){
            if(nums[i] == val){
                nums[i] = nums[n];
                n--;
            }else{
                i++;
            }
        }
        return n+1;
    }
}