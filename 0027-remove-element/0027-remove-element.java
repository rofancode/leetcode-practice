
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int len = nums.length;
        int removedLen = len;
        int[] removedNums = new int[len];
        int idx = 0;
        for (int num : nums) {
            if (num == val) {
                removedLen--;
            } else {
                nums[idx++] = num;
            }
        }
        return removedLen;
    }
    
}