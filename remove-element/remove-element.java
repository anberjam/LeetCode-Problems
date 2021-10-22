class Solution {
    public int removeElement(int[] nums, int val) {
        int switches = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=val) {
                nums[switches] = nums[i];
                switches++;
            }
        }
        return switches;
    }
}