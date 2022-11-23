class Solution {
    public int search(int[] nums, int target) {
        int i=0, length=nums.length-1, mid;
        while(i<=length){
            mid = (i+length)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                length=mid-1;
            }
        }
        return -1;
    }
}
