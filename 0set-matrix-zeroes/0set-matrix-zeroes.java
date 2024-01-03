class Solution {
    public void setZeroes(int[][] matrix) {
        //  O(MN)
        /*
            전체 훓으면서 0일 때 i, j 값 저장 
            
        */
        int M = matrix.length;
        int N = matrix[0].length;
        boolean [] rowZero = new boolean[M];
        boolean [] colZero = new boolean[N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j ++) {
                if (matrix[i][j] != 0)
                    continue;
                
                if (!rowZero[i]) 
                    rowZero[i] = true;
                if (!colZero[j])
                    colZero[j] = true;
            }
        }
        
         for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (rowZero[i] || colZero[j]) 
                    matrix[i][j] = 0;
            }
         }
    }
}