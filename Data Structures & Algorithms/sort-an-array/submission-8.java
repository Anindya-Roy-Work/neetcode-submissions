class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }

    private void mergeSort(int[] nums, int l, int r){
        if(l>=r) return;
        int m = (l+r)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,m,r);
    }

    private void merge(int[] nums, int l, int m, int r){
        int[] arr = new int[r-l+1];
        int i = l;
        int j = m+1;
        int k = 0;
        while(i<=m && j<=r){
            if(nums[i] < nums[j]){
                arr[k++] = nums[i++];
            }else{
                arr[k++] = nums[j++];
            }
        }
        while(i<=m) arr[k++] = nums[i++];
        while(j<=r) arr[k++] = nums[j++];
        for(i = l; i<=r;i++){
            nums[i] = arr[i-l];
        }
    }


}