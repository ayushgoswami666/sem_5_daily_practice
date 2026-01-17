// Last updated: 1/18/2026, 2:18:40 AM
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
12    public ListNode swapPairs(ListNode head) {
13        if(head==null || head.next==null){
14            return head;
15        }
16        ListNode temp = head.next;
17        head.next = swapPairs(temp.next);
18        temp.next = head;
19        return temp;
20
21        
22    }
23    
24}