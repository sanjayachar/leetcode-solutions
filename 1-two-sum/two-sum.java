class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int dif = target - nums[i];
            if(map.containsKey(dif)) {
                arr[0] = map.get(dif);
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}