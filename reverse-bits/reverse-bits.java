public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            ans <<= 1; // ans 1칸 왼쪽으로 옮기고,
            ans |= (n & 1);  //비트OR연산자 로 ans와 곱하기 | (n의 가장 오른쪽 값을)  
            n >>= 1;
        }
        return ans;
    }
}
// & 비트AND연산자 각 위치의 값 모두 1일 때 1
// | 비트OR연산자  각 위치의 값 중 1개 1이면 1
// ^ 비트XOR연산자 각 위치의 값 서로 다르면 1
// ~ 비트NOT연산자 각 위치의 값 반대로 바꿈 ~1010 -> ...11111111111111111111111111111101