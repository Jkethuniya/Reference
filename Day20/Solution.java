class Solution {
    public void sortColors(int[] nums) {
        int one=0, two=0, zero=0;
        for(int i: nums){
            if(i==0)
                zero++;
            else if(i==1)
                one++;
            else if(i==2)
                two++;
        }
        int count=nums.length;
        while(count>0){
            count--;
            if(two>0){
                nums[count]=2;
                two--;
            }else if(one>0){
                nums[count]=1;
                one--;
            }else if(zero>0){
                nums[count]=0;
                zero--;
            }
        }
    }
}
