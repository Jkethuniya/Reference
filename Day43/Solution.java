class Solution {
    public int diagonalSum(int[][] mat) {
        int midVal=0, size = mat.length, ans=0;
        if(mat.length % 2 ==1){
            midVal = mat[mat.length/2][mat.length/2];
        }
        for(int j=0; j<mat.length; j++){
            ans+= mat[j][j]+mat[j][--size];
        }
        return ans-midVal;
    }
}
