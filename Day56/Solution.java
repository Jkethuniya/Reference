class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft=0, sumRight=0;
        for(int i=0; i<nums.length; i++){
            sumLeft = sum(nums, 0, i-1);
            sumRight = sum(nums, i+1, nums.length-1);
            if(sumLeft == sumRight){
                return i;
            }
        }
        return -1;
    }
    public int sum(int[] arr, int i, int j){
        int sum=0;
        for(;i<=j;i++){
            sum+= arr[i];
        }
        return sum;
    }
}
