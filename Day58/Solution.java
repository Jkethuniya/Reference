

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int chk=0;
        int productOfArray = 1;
        for(int i: nums){
            if(i!=0)
                productOfArray=i*productOfArray;
            else
                chk++;
        }
        for(int i=0; i<nums.length; i++){
            if(chk==1){
                if(nums[i] != 0)
                    nums[i] = 0;
                else
                    nums[i]=productOfArray;
            }else if(chk>1){
                nums[i]=0;
            }
            else{
                nums[i] = productOfArray/nums[i];
            }
        }
        return nums;
    }
}

class NewFile{
    void display(){
        System.out.println("Hi there");
    }
}
