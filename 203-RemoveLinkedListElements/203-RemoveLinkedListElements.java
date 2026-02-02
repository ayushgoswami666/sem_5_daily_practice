// Last updated: 2/2/2026, 10:07:04 PM
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
12    public ListNode removeElements(ListNode head, int val) {
13
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16
17        ListNode prev = dummy;
18        ListNode curr = head;
19
20        while (curr != null) {
21            if (curr.val == val) {
22                prev.next = curr.next;
23            } else {
24                prev = curr;
25            }
26            curr = curr.next;
27        }
28
29        return dummy.next;
30    }
31}
32