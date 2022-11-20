class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> hSet;
        for(int i=0; i<matrix.length; i++){
            hSet = new HashSet<>();
            for(int j=0; j<matrix.length; j++){
                hSet.add(matrix[i][j]);
                if(hSet.size()<=j){
                    return false;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            hSet = new HashSet<>();
            for(int j=0; j<matrix.length; j++){
                hSet.add(matrix[j][i]);
                
                if(hSet.size()<=j){
                    return false;
                }
            }
        }
        
        return true;
    }
}
