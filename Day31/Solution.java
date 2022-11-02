class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] symArray = s.toCharArray();
        for(char ch: symArray){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
                continue;
            }
            else if(stack.empty()){
                return false;
            }
             char pop = stack.pop();
             if(pop=='(' && ch != ')'){
                return false;
             }else if(pop=='[' && ch != ']'){
                return false;
             }else if(pop=='{' && ch != '}'){
                return false;
             }
        }
        return stack.empty();
    }
}
