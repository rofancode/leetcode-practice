class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
            two pointer
            letters : 저장 데이터 structure
            letters 에 end point 값 있는 지 확인 
            -> 있으면 기존 idx -> endpoint, start point = endpoint, length 계산
               -> appa인 경우 start point = 2 이고 end point = 3 (a) 일 때 Hasmap 에서 조회됨 
            => idx < start 면 포함 안되는것이므로 end Point ++
            -> 없으면 end point++
            
            => charater, index 값 저장 필요
            HashMap
        */
        if (s.length() < 2) return s.length();
        
        int max = 0;
        Map<Character, Integer> letters = new HashMap<>();
        char [] arr = s.toCharArray();
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            char c = arr[end];
            
            if(letters.containsKey(c)){
                //중복되는 곳 + 1 로 이동!
                start = Math.max(start, letters.get(c)+1);
            }
            max = Math.max(max, end - start + 1);
            letters.put(c, end);
        }   
        
        return max;
    } //timecomplexity = O(N)
      //space complexity = O(M) size of table O(26) = O(1)
}