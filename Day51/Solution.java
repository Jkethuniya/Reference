class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++){
            int num = target-numbers[i];
            int ind = Arrays.binarySearch(numbers,num);
            if(ind>=0 && ind!=i){
                if(i<ind)
                    return new int[]{i+1,ind+1}; 
                return new int[]{ind+1,i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
