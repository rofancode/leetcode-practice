import java.util.*;

class Solution {

    int[] nums;
    int[] origin; 
    public Solution(int[] nums) {
        this.nums = nums;
        this.origin = nums.clone();
    }
    
    public int[] reset() {
         return origin;
        
    }
    
    public int[] shuffle() {
        
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            int j = random.nextInt(nums.length);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */