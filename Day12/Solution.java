class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i=i+2){
            if(nums[i]!=nums[i+1]){
                if(nums[i+1]==nums[i+2]){
                    return nums[i];
                }else{
                    return nums[i+1];
                }
            }
        }
        return nums[nums.length-1];
    }
}
