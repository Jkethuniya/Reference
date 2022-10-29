class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i=0, j=ch.length-1;
        List vowelList=Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'});
        while(i<=j){
            if(vowelList.contains(ch[i])){
                if(vowelList.contains(ch[j])){
                    char c=ch[i];
                    ch[i]=ch[j];
                    ch[j]=c;
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return String.valueOf(ch);
    }
}
