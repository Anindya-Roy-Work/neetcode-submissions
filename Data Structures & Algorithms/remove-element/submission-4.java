class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        /*
        for(int j = 0; j < n; j++){
            if(nums[j] != val){
                nums[i++] = nums[j];
            }
        }
        */
        int j = n-1;
        while(i<=j){
            if(nums[i] == val){
                nums[i] = nums[j];
                j--;
            }else{
                i++;
            }
        }
        return i;
    }
}