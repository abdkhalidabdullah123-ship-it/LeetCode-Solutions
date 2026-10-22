class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Four Pointer Technique needed.....
        int startingRow = 0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        // Creating a new list to add answer
        List<Integer> result = new ArrayList<>();

        while (startingRow <= endingRow && startingCol <= endingCol){
            // This will ensure the atleast one Row and One Column Matrix

            // Step 1 . Left to Right , row wise , Row will be fixed that is Starting Row and Column will iterate from Starting Col to Ending Col
            for (int col = startingCol; col <= endingCol; col++){
                result.add(matrix[startingRow][col]);
                
            }
            startingRow++;
            
            // Step 2 : Top to Bottom Column Wise , Column will be fixed that is Ending Column and row will iteraate from Starting row to ending row
            for (int row = startingRow; row <= endingRow; row++){
                result.add(matrix[row][endingCol]);
                
            }
            endingCol--;
            //Step 3 : Right to Left Row Wise , Row will be fixed that is ending row , column will iterate from Ending Col to Starting Col
            // We have to check wether is there any row to print
            if (startingRow <= endingRow){
                   for (int col = endingCol; col >= startingCol; col--){
                   result.add(matrix[endingRow][col]);   
                }
            }
           
            endingRow--;
            
            //step 4: Bottom to top column wise , column will be fixed that is Starting col row will iterate from ending row to starting row

            //  we have to check wether if there is any column left to print
            if (startingCol <= endingCol){
                for (int row = endingRow; row >= startingRow; row--){
                result.add(matrix[row][startingCol]);
                
              }
            }
            startingCol++;

      }


        return result;



        
    }
}