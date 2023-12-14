import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        
        int [][] alphabets = new int[26][2];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabets[c-'a'][0]++;
            alphabets[c-'a'][1] = i;
        }
        int result = s.length();
        for (int i = 0; i < alphabets.length; i++) {
            if(alphabets[i][0] == 1) {
                result = Math.min(result, alphabets[i][1]);
            }
        }
        
        return result== s.length()? -1 : result;
    }
}