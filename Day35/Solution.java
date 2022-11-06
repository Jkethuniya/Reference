class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp,temp2;
        temp = head;
        temp2 = temp;
        while(temp2!=null){
            stack.push(temp.val);
            temp = temp.next;
            temp2 = temp2.next.next;
        }
        int max = 0;
        while(temp!=null){
            int tempVal = temp.val + stack.pop();
            if(tempVal>max){
                max=tempVal;
            }
            temp = temp.next;
        }
        return max;
    }
}
