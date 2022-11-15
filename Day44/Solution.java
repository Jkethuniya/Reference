class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            int j=0, size = image[i].length-1;
            while(j<size){
                int temp = image[i][j];
                image[i][j] = image[i][size];
                image[i][size] = temp;
                j++;
                size--;
            }
        }
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                image[i][j] ^= 1; 
            }
        }
        return image;
    }
}
