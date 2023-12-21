class Solution {
    public int hammingDistance(int x, int y) {
        //비트 서로 다름 경우 cnt 1 * 0 = 1, 1*1 = 0, 0*0 = 0 ^
        int xor = x^y;
        int distance = 0;
        while(xor != 0) {
            if(xor % 2 == 1) //홀수인경우
                distance++;
            xor = xor >> 1;
        }
        
        return distance;
    }
}