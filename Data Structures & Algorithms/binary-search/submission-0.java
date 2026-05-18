class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binSearch(nums, target, 0 , n-1);
    }

    private int binSearch(int[] nums, int target, int st, int en){
        if(st>en) return -1;
        int mid = st+(en-st)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid] < target) return binSearch(nums,target,mid+1,en);
        return binSearch(nums,target,st,mid-1);
    }

}
