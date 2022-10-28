class Solution {
    public void reverseString(char[] s) {
        int fst=0, lst=s.length-1;
        while(fst<=lst){
            char ch=s[fst];
            s[fst]=s[lst];
            s[lst]=ch;
            fst++;
            lst--;
        }
    }
}
