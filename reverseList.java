/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * 
 */


// Recursive Solution (Not Optimal)
// both solutions use a temp ListNode to store the next next Node
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        ListNode tail = new ListNode(head.val);
        
        return reverseOrder(tail, head.next);
    }
	
	public ListNode reverseOrder(ListNode caller, ListNode nextNode){
        
        if(nextNode.next != null){
            ListNode holder = new ListNode(nextNode.val, nextNode.next);
			nextNode.next = caller;
			return reverseOrder(nextNode, holder.next);
        }
        return new ListNode(nextNode.val, caller);
	}
}

// Optimal Solution (MOST optimal solution uses iterators, i think)
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null; 
        ListNode curr = head;
        while (curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}