class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0, tempSum;
        for(int i: nums){
            sum+=i;
        }
        tempSum = 0; 
        for(int i=0; i<nums.length; i++){
            int n=sum-nums[i];
            if(n%2==0 && tempSum == n/2){
                return i;
            }
            tempSum+=nums[i];
        }
        return -1;
    }
}
