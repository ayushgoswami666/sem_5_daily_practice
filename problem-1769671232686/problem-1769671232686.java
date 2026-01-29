// Last updated: 1/29/2026, 12:50:32 PM
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
12    public void reorderList(ListNode head) {
13        // base case
14        if(head==null){
15            return;
16
17        }
18        // dividing the list in two parts
19        ListNode slow = head;
20        ListNode fast = head;
21        while(fast!=null&&fast.next!= null){
22            slow = slow.next;
23            fast = fast.next.next;
24        }
25
26        ListNode last = slow.next;
27        slow.next = null;
28        ListNode prev = null;
29
30        while(last!=null){
31            ListNode temp = last.next;
32            last.next = prev;
33            prev = last;
34            last = temp;
35
36
37        }  
38        ListNode first = head;
39        last = prev ;
40         while (last != null) {
41            ListNode temp1 = first.next, temp2 = last.next;
42            first.next = last;
43            last.next = temp1;
44            first = temp1;
45            last = temp2;
46        }        
47
48    }
49}