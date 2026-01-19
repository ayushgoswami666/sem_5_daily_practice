// Last updated: 1/19/2026, 11:24:25 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode v = headA;
15        ListNode vg = headB;
16        while(v!=vg){
17            if(v== null){
18                v=headB;
19            }
20            else{
21                v = v.next;
22            }
23            if(vg == null){
24                vg = headA;
25
26            }
27            else{
28                vg = vg.next;
29            }
30        }
31        return v;
32        
33    }
34}