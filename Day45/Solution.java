class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j=0, i=matrix.length-1;
        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j]<target){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}
