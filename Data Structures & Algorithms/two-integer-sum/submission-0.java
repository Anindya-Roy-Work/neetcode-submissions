class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(mp.containsKey(nums[i])){
                ans[0] = mp.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            mp.put((target-nums[i]), i);
        }
        return ans;
    }
}
