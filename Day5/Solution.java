class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg = 0;
        int end = nums.length-1;
        while(beg <= end)
        {
            int mid = (beg + end) / 2;
            if(nums[mid] == target)
                return mid;
            else if(mid+1 < nums.length && target > nums[mid] && nums[mid+1] > target)
                return mid+1;
            else if(target > nums[mid] && mid+1 == nums.length)
                return mid+1;
            else if(nums[mid] > target)
                end = mid-1;
            else
                 beg = mid+1;
        }
        return 0;
    }
}
