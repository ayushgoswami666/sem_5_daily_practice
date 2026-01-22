// Last updated: 1/22/2026, 11:34:33 PM
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
12    public ListNode sortList(ListNode head) {
13        if(head==null || head.next==null){
14            return head;
15        }
16        ListNode mid = middle_node(head);
17        ListNode midnext = mid.next;
18        mid.next = null;
19        ListNode A = sortList(head);
20        ListNode B = sortList(midnext);
21        return merge_list(A,B);
22
23    }
24    public ListNode middle_node(ListNode head){
25        ListNode slow = head;
26        ListNode fast = head;
27        while(fast.next!=null && fast.next.next!=null){
28            slow = slow.next;
29            fast = fast.next.next;
30        }
31        return slow;
32    }
33    public ListNode merge_list(ListNode A,ListNode B){
34        ListNode Dummy = new ListNode();
35        ListNode temp = Dummy;
36        while (A!=null && B!=null){
37            if(A.val <B.val){
38                Dummy.next = A;
39                A = A.next;
40                Dummy = Dummy.next;
41            }
42            else{
43                Dummy.next = B;
44                B = B.next;
45                Dummy = Dummy.next;
46
47            }
48        }
49        if(A==null){
50            Dummy.next = B;
51        }
52        if(B==null){
53            Dummy.next = A;
54        }
55        return temp.next;
56
57        
58    
59}
60}