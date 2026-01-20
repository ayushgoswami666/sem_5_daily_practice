// Last updated: 1/20/2026, 10:32:42 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode current = head;
14        while(current!=null && current.next!=null){
15            if(current.val==current.next.val){
16                current.next = current.next.next;
17            }
18            else{
19                current = current.next;
20            }
21        }
22        return head;
23
24
25   }
26}