class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase();
        s = s.replaceAll("-","");
        char[] sArray = s.toCharArray();
        int kChk=0;
        String newString="";
        for(int i=sArray.length-1; i>=0; i--){
            if(kChk==k){
                newString = '-' + newString;
                kChk=0;
            }
            newString = sArray[i] + newString;
            kChk++;
        }
        return newString;
    }
}
