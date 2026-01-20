// Last updated: 1/20/2026, 10:51:20 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if(head == null || head.next == null){
4             return head;
5        }
6        if(head.val == head.next.val) {
7            int val = head.val;
8            while(head != null && head.val == val) 
9                head = head.next;
10            return deleteDuplicates(head);
11        }
12        head.next = deleteDuplicates(head.next);
13        return head;
14    }
15}