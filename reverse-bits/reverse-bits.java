public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            ans <<= 1; // ans 1칸 왼쪽으로 옮기고,
            ans |= (n & 1);  //(n의 가장 오른쪽 값을) | 비트OR연산자 로 ans와 곱하기
            n >>= 1;
        }
        return ans;
    }
}