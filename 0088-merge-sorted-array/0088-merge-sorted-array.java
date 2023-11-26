class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // from back - decreasing order
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        /*
        p2 < 0, p1 >= 0  -> num1 left -> no merge  
        p2 >= 0, p1 < 0  -> num2 left -> num2 merge, 
        
        p2 >= 0, p1 >= 0 -> m1 > m2 -> num1 add  
        p2 >= 0, p1 >= 0 -> m1 < m2 -> num2 add
        
        */
        while(p2 >= 0) {
          if (p1 >= 0 && nums1[p1] > nums2[p2]) {
              nums1[pMerge--] = nums1[p1--];
          }  else {
              nums1[pMerge--] = nums2[p2--];
          }
        }
       
    }
}
// time O(N+M) , space O(1)