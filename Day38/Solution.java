class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> charStack = new Stack<>();
        for(char i: s.toCharArray()){
            if(i!=')'){
                charStack.push(i);
            }else{
                String temp = "";
                while(charStack.peek()!='('){
                    temp+=charStack.pop();
                }
                charStack.pop();
                for(char ch: temp.toCharArray()){
                    charStack.push(ch);
                }
            }
        }
        String retString = "";
        while(!charStack.isEmpty()){
            retString = charStack.pop() + retString;
        }
        return retString;
    }
}
