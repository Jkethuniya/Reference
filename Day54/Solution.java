class Solution {
    public boolean checkIfExist(int[] arr) {
        int res;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            res = binarySearch(arr, arr[i]*2);
            if(res!=-1 && i!=res){
                return true;
            }
        }
        return false;
    }
    public int binarySearch(int[] nums, int target) {
            
        
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
