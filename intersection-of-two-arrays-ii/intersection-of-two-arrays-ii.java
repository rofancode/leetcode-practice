import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List <Integer> ans = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < nums1.length && idx2 < nums2.length) {
            int num1 = nums1[idx1];
            int num2 = nums2[idx2];
            if(num1 == num2) {
                ans.add(num1);
                idx1++;
                idx2++;
            }else if(num1 < num2) {
                idx1++;
            }else {
                idx2++;
            }
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}