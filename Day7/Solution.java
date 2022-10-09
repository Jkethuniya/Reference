/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode l1=head, l2=head;
        while(l2!=null){
            l2=l2.next;
            if(l2==null){
                return l1;
            }else{
                l2=l2.next;
            }
            l1=l1.next;
        }
        return l1;
        
    }
}
