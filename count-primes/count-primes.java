class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean [] isNotPrimes = new boolean[n + 1];
        
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (!isNotPrimes[i]) {
                for(int j = i*i; j <= n; j+=i) {
                    //i*k(k<i) 인경우 이미 k*i 형태로 체크함
                    //i*i 부터 i의 배수 
                    isNotPrimes[j] = true; 
                }
            }
        }
        
        int count = 0;
        
        for(int i = 2; i < n; i++) {
            if (!isNotPrimes[i])
                count++;
        }
        
        return count;
    }
    
    
    
}