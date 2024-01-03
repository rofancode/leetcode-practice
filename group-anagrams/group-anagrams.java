class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        
        for (String str : strs) {
            
            //anagram 확인 용 key 만들기
            char [] count = new char[26];
            for (char c: str.toCharArray()) count[c-'a']++;
            String key = new String(count);
            
            //anagrams 확인 및 추가
            //key에 대해 기존 값 있으면 value반환, 없으면 k-> new ArrayList 람다식 호출 반환
            //객체에 str추가
            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        //ans.values() 는 collection에서 제공하는 기능으로 value들을 Collection 형태로 값을 반환  
        // Collection<List<String>
        // ArrayList<>(Collection객체)는 Collection을 -> ArrayList<> 로 변경 
        return new ArrayList<>(ans.values());
        
    }
}
// Time O(N * N *  100) = O(N^2)
// Space O(1)