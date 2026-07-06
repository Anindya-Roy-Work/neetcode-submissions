class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                ans[0] = mp.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            mp.put(target-nums[i],i);
        }
        return ans;
    }
}
