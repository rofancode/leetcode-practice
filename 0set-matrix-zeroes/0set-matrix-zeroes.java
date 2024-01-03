class Solution {
    public void setZeroes(int[][] matrix) {
        //  Time O(MN), Space O(M+N)
        /*
            전체 훓으면서 0일 때 i, j 값 저장 
            첫번째 열, 컬럼을 flag로 사용
            이때 0,0 의 경우 첫번째 열 혹은 컬럼에 0 이 있을 때 이 0이 컬럼의 0인지 열의 0인지 구분이 어렵다 
            -> 첫번째 열 or 컬럼 1개 기준으로 셀 확인해서 flag설정 필요
            -> 0.0은 열의 0으로 설정
            -> 컬럼의 0은 isCall flag로 뺌 
        */
        int M = matrix.length;
        int N = matrix[0].length;
        
        boolean isCol = false;
        
        for (int i = 0; i < M; i++) {
            if (matrix[i][0] == 0)
                isCol = true;
            //[i][0] == 0 일때 0,0 = 0 세팅 방지
            for (int j = 1; j < N; j ++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 첫번째 열, 첫번째 컬럼 제외하고 내부 먼저 update
        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) 
                    matrix[i][j] = 0;
            }
        }
        
        // 첫번째 열 update
        if (matrix[0][0] == 0) {
            for (int j = 0; j < N; j ++) {
                matrix[0][j] = 0;
            }
        }
        
        // 첫번째 컬럼 update
        if (isCol) {
            for (int i = 0; i < M; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}