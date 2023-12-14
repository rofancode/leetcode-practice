class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if ( n == 1 || k == 0) 
            return ;
        
        // k개 이동 (k < nums.length) 
        // 덩어리 2개로 나눔
        // 1 ~ (n - k) / (n - k + 1)  ~ n
        // (n - k + 1)  ~ n / 1 ~ (n - k) 변경 
        // == 1 ~ k / (n - k) ~ n
        // 1) n ~ 0  
        reverse(nums, 0, n - 1);
        // 2) 1 ~ k /
        reverse(nums, 0, k - 1);
        // 3)       / k+1 ~ n
        reverse(nums, k, n - 1);
        
    }
    // 0, 1, 2, 3 , 4, 5, 6
    private void reverse(int[] nums, int sIdx, int eIdx) {
        for (int i = 0; i <= (eIdx - sIdx) / 2; i++) {
            int tmp = nums[sIdx + i];
            nums[sIdx + i] = nums[eIdx - i];
            nums[eIdx - i] = tmp;
        }
    }
}
// time complexity O(N)