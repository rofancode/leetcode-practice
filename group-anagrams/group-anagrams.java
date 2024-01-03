class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        
        for (String str : strs) {
            boolean hasAnagram = false;
            
            //anagrams 확인
            for (List<String> anagram: ans) {
                hasAnagram = isAnagram(str, anagram.get(0));
                if(hasAnagram){
                    anagram.add(str);
                    break;
                }
            }
            // 없으면 추가
            if(!hasAnagram) {
                List<String> anagram = new ArrayList<>();
                anagram.add(str);
                ans.add(anagram);
            }
        } 
        
        return ans;
        
    }
    
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        
        int [] alph = new int [26];
        for (int i = 0; i < str1.length(); i++) {
            alph[str1.charAt(i) -'a']++;
            alph[str2.charAt(i) -'a']--;
        }
        
        for (int i : alph){
            if (i != 0) return false;
        }
        
        return true;
    }
}
// Time O(N * N *  100) = O(N^2)
// Space O(1)