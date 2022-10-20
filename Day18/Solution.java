class Solution {
    public int maxArea(int[] height) {
        int max=0; 
        int left=0, right=height.length-1; 
        while(left!=right){
            int temp;
            if(height[left]<height[right]){
                temp=height[left]*(right-left);
                if(max<temp){
                    max=temp;
                }
                left++;
            }else if(height[left]>=height[right]){
                temp=height[right]*(right-left);
                if(max<temp){
                    max=temp;
                }
                right--;
            }
        }
        return max;
    }
}
