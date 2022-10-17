class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }
        int ret=1;
        while(true){
            if(set.contains(ret)){
                ret++;
            }else{
                return ret;
            }
        }
    }
}
