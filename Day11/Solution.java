class Solution {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
        int carry=1;
        for(int i=length-1; i>=0; i--){
            if(carry==1){
                carry=0;
                digits[i]+=1;
                carry=digits[i]/10;
                digits[i]%=10;
            }
        }
        if(carry==1){
            int new1[] = new int[length+1];
            new1[0] = 1;
            for(int i=1; i<=length; i++){
                new1[i] = digits[i-1];
            }
            return new1;
        }
        return digits;
    }
}
