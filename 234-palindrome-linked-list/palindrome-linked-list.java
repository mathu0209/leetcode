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
       public static ListNode reverseList(ListNode head) {
     ListNode node = null;
     while (head != null) {
        ListNode temp = head.next;
        head.next = node;
        node = head;
        head = temp;
     }   
     return node;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhalf = slow.next;
        slow.next = null;
        secondhalf = reverseList(secondhalf);
        ListNode p1= head;
        ListNode p2 = secondhalf;
        while(p2 !=null){
            if(p1.val !=p2.val){
                return false;
            }
            p1=p1.next;
            p2 = p2.next;
        }
       return true;      
    }
}