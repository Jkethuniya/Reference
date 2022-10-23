class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=(nums.length*(nums.length+1))/2;
        for(int i: nums){
            ans-=i;
        }
        return ans;
    }
}
