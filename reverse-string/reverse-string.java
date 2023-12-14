class Solution {
    public void reverseString(char[] s) {
        int sIdx = 0;
        int eIdx = s.length - 1;
        while (sIdx < eIdx) {
            char tmp = s[sIdx];
            s[sIdx] = s[eIdx];
            s[eIdx] = tmp;
            sIdx++; 
            eIdx--;
        }
    }
}