public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        
        String biStr =  Integer.toBinaryString(n);
        
        for(int i = 0; i <biStr.length() ; i++) {
            if (biStr.charAt(i) == '1') 
                ans++;
        }
        
        return ans;
    }
}