class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxCount=0,maxNum=nums[0];
        int num=nums[0], count=0;
        for(int i: nums){
            if(i==num){
                count++;
            }else{
                count=1;
                num=i;
            }
            if(count>=nums.length/2 && count >maxCount){
                    maxCount=count;
                    maxNum=num;
                    num=i;
                }
            }
            return maxNum;
    }
}
