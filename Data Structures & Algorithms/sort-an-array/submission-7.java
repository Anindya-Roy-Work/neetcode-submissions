class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        sort(nums,0,n-1);
        return nums;
    }

    private void sort(int[] nums, int l, int r){
        if(l>=r) return;
        int m = (l+r)/2;
        sort(nums,l,m);
        sort(nums,m+1,r);
        merge(nums,l,m,r);
    }

    void merge(int[] nums, int l, int m, int r){
        List<Integer> lis = new ArrayList<>();
        int i = l,j = m + 1,k = l;
        while(i <= m && j <= r){
            if(nums[i] < nums[j]) lis.add(nums[i++]);
            else lis.add(nums[j++]);
        }
        while(i<=m) lis.add(nums[i++]);
        while(j<=r) lis.add(nums[j++]);
        while(k<=r){ nums[k]=lis.get(k-l); k++;}

    }

}