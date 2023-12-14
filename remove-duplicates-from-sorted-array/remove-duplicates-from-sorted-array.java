class Solution {
    public int removeDuplicates(int[] nums) {
        // k 는 중복이 발생하지 않은 수
        // i는 비교하는 loop index
        // 중복이 발생하지 않았을 때 k번째에 값을 추가하면 되겠다
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[k++] = nums[i]; 
            }
        }
        return k; 
    }
}