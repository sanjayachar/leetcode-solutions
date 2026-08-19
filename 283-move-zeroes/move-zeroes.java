class Solution {
    public void moveZeroes(int[] nums) {
        int l=0, r=1;
        while(r<nums.length) {
            if(nums[l] == 0 && nums[r] != 0) {
                swap(nums, l, r);
            } 
            if (nums[l] != 0) {
                l++;
            }
            r++;
        }
    }
    void swap(int[]nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}