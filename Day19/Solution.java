 class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
//Initializing Head List which will contain answers and a temp list to store triplets.
        Set<ArrayList<Integer>> headList = new HashSet<>();
        List<Integer> tempList;
        for(int i=0; i<nums.length-1; i++){
            int one=nums[i];
            for(int j=i+1;j<nums.length;j++){
                //get the necessary value of the third index and then search the index using binary search
                int two=nums[j];
                int three = -(one+two);
                int ind = Arrays.binarySearch(nums, three);
                if(ind>-1 && ind!=i && ind!=j ){    
                    tempList=new ArrayList<>();
                    if (three <= one) {
                        tempList.add(three);
                        tempList.add(one);
                        tempList.add(two);
                    } else if (three <= two) {
                        tempList.add(one);
                        tempList.add(three);
                        tempList.add(two);
                    } else {
                        tempList.add(one);
                        tempList.add(two);
                        tempList.add(three);
                    }
                    headList.add(new ArrayList(tempList));
                }
            }
        }
        return new ArrayList<>(headList);
    }
}
