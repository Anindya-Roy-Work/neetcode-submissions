class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int i = 0, curr = nums[0], k = 0, n = nums.length;
        int res = 0;
        
        while(i<n){
            if(curr != nums[i]){
                curr = nums[i];
                k = 0;
            }
            while(i<n && nums[i] == curr){i++;}
            k++;
            curr++;
            res = Math.max(res,k);
        }
        return res;
    }
}
