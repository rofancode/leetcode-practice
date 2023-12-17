class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIdx = m + n - 1; 
        n--;
        m--;
        while (mIdx >= 0) {
            if(m < 0) {
                nums1[mIdx--] = nums2[n--];
                continue;
            } 
            
            if(n < 0){
                nums1[mIdx--] = nums1[m--];
                continue;
            }
                    
            nums1[mIdx--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            
        }
       
    }
}
// time O(N+M) , space O(1)