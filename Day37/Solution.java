class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        boolean result = true;
        Stack<Integer> chk = new Stack<>();
        int popInd = 0;
        for(int i: pushed){
            chk.push(i);
            
            if(chk.peek() == popped[popInd]){
                while(!chk.isEmpty() && popped[popInd] == chk.peek()){
                    chk.pop();
                    popInd++;
                }
            }
        }
        return chk.isEmpty();
    }
}
