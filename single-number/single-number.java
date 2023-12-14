import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int result = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                result = num;
                break;
            }
        }
        
        return result ;
    }
}