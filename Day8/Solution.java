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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp1,temp2=new ListNode();
        int count=0;
        temp1=head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        k=k%count;
        for(int i=1; i<=k; i++){
            temp1=head;
            while(temp1.next!=null){
                temp2=temp1;
                temp1=temp1.next;
            }
            temp2.next=null;
            temp1.next=head;
            head=temp1;
            
        }
        return head;
    }
}
