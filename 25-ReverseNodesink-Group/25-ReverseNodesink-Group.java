// Last updated: 1/24/2026, 11:05:41 PM
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
11
12class Solution {
13
14
15    private ListNode reverse(ListNode head){
16        ListNode prev = null;
17        ListNode curr = head;
18        while(curr!=null){
19            ListNode next = curr.next;
20            curr.next = prev;
21            prev = curr;
22            curr = next;
23        }
24        return prev;
25    }
26
27    public ListNode reverseKGroup(ListNode head, int k) {
28        if(head == null || head.next == null || k==1) return head;
29
30        ListNode prev = null;
31        ListNode curr = head;
32        for(int i=0;i<k;i++){
33            prev = curr;
34            if(curr == null) return head;
35            curr = curr.next;
36        }
37        prev.next = null;
38        ListNode reversedHead = reverseKGroup(curr, k);
39        ListNode revHead = reverse(head);
40        ListNode tmp = revHead;
41        while(tmp.next!=null){
42            tmp = tmp.next;
43        }
44        tmp.next = reversedHead;
45        return revHead;
46    }
47
48}