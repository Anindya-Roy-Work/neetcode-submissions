class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int c = 0;
        for(int num : nums){
            if(c==0){
                res = num;
            }
            if(num == res) c++;
            else c--;
        }
        return res;
    }
}