// Last updated: 1/30/2026, 7:47:35 PM
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
12    public ListNode insertionSortList(ListNode head) {
13        // I don't know how to do this insertion way but here is the  sorting way
14        ArrayList<Integer>list=new ArrayList<>();
15        ListNode thead=head;
16        while(thead!=null){
17            list.add(thead.val);
18            thead=thead.next;
19        }
20        list.sort(null);
21        thead=head;
22        int index=0;
23        while(thead!=null){
24            thead.val=list.get(index++);
25            thead=thead.next;
26        }
27        return head;
28    }
29}