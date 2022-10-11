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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp,temp2;
        int count=0;
        temp = head;
        while(temp!=null){
            count++; 
            temp= temp.next;
        }
        temp=temp2=head;
        for(int i=1; i<k; i++){
            temp=temp.next;
        }
        for(int i=1; i<=count-k; i++){
            temp2=temp2.next;
        }
        int n=temp.val;
        temp.val=  temp2.val;
        temp2.val=n;
        
    return head;
    }
}
