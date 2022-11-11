class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(!chk(matrix, i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean chk(int[][] matrix, int i, int j){
        int temp=matrix[i][j];
        while(++i<matrix.length && ++j<matrix[0].length){
            if(temp != matrix[i][j]){
                return false;
            }
        }
        return true;
    }
}
