class Solution {
    public void rotate(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int n=arr.length-1;
        for(int i=0; i<=n; i++){
            int j=0;
            while(j<=n/2){
                int temp =arr[i][j];
                arr[i][j] = arr[i][n-j];
                arr[i][n-j] = temp;
                j++;
            }
        }
    }
}
