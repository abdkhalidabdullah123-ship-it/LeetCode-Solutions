class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        //First Step Transpose
        // swap in place without creating any other matrix
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2 swap elements of rows only
       
        for (int i = 0; i < n; i++){
             int j = 0; 
             int k = n-1;
            while(j < k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
       
        
    }
}